package BitManipulation.Easy;
/*
给定两个字符串 s 和 t，它们只包含小写字母。
字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
请找出在 t 中被添加的字母。

示例:
输入：
s = "abcd"
t = "abcde"
输出：
e

解释：
'e' 是那个被添加的字母。
 */
public class FindTheDifference_389 {

    public static void main(String[] args){

        System.out.println(findTheDifference("abcd","abcde"));
    }
    public static char findTheDifference(String s, String t) {

        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<s.length();i++)
            sum1=sum1+s.charAt(i);
        for(int j=0;j<t.length();j++)
            sum2=sum2+t.charAt(j);
        return (char)(sum2-sum1);
    }
}
