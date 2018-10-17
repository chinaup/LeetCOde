package Math.Easy;
/*
给定一个Excel表格中的列名称，返回其相应的列序号。

例如，

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...

示例 1:
输入: "A"
输出: 1

示例 2:
输入: "AB"
输出: 28

示例 3:
输入: "ZY"
输出: 701
 */
public class ExcelSheetColumeNumber_171 {

    public static void main(String[] args){

        System.out.println(titleToNumber("AAA"));
    }

    public static int titleToNumber(String s) {

        char[] c = s.toCharArray();
        int sum = 0;
        int num = 1;
        for(int i=c.length-1;i>=0;i--){
            sum=sum+(c[i]-'A'+1)*num;
            num=num*26;
        }
        return sum;
    }

}














