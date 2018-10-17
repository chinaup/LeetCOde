package Math.Easy;

import java.util.ArrayList;
import java.util.List;

/*
给定一个正整数，返回它在 Excel 表中相对应的列名称。

例如，

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    ...

示例 1:
输入: 1
输出: "A"

示例 2:
输入: 28
输出: "AB"

示例 3:
输入: 701
输出: "ZY"
 */
public class ExcelSheetColumeTitle_168 {

    public static void main(String[] args){

        System.out.println(convertToTitle(703));
    }

    public static String convertToTitle(int n) {

        List<Character> l = new ArrayList<>();
        while(n>0){
            int m = n%26;
            if(m==0){
                l.add('Z');
                n=n-26;
            }
            else{
                l.add((char)('A'+m-1));
                n=n-m;
            }
            n=n/26;
        }
        String s = "";
        for(int i=l.size()-1;i>=0;i--)
            s=s+l.get(i);
        return s;
    }
}
