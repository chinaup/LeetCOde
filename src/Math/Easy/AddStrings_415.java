package Math.Easy;

import java.util.ArrayList;
import java.util.List;

/*
给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。

注意：
num1 和num2 的长度都小于 5100.
num1 和num2 都只包含数字 0-9.
num1 和num2 都不包含任何前导零。
你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 */
public class AddStrings_415 {

    public static void main(String[] args){

        System.out.println(addStrings("9","99"));
    }

    public static String addStrings(String num1, String num2) {

        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int i = c1.length-1;
        int j = c2.length-1;
        List<Integer> l = new ArrayList<>();
        int flag = 0;
        while(i>=0 && j>=0){
            int a = (int)c1[i]-48;
            int b = (int)c2[j]-48;

            if(a+b+flag>=10){
                l.add(a+b+flag-10);
                flag=1;
            }
            else{
                l.add(a+b+flag);
                flag=0;
            }
            i--;
            j--;
        }
        if(i<0 && j<0 && flag==1)
            l.add(1);
        else if(i>=0){
            while(i>=0){
                if((int)(c1[i])-48+flag>=10){
                    flag=1;
                    l.add(0);
                }
                else{
                    l.add((int)(c1[i])-48+flag);
                    flag=0;
                }
                i--;
            }
            if(flag==1)
                l.add(1);
        }
        else if(j>=0){
            while(j>=0){
                if((int)(c2[j])-48+flag>=10){
                    flag=1;
                    l.add(0);
                }
                else{
                    l.add((int)(c2[j])-48+flag);
                    flag=0;
                }
                j--;
            }
            if(flag==1)
                l.add(1);
        }

        String s = "";
        for(int k=l.size()-1;k>=0;k--)
            s=s+(char)(l.get(k)+'0');

        return s;

    }

}
























