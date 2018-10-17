package String.Easy;
/*
实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

示例 1：
输入: "Hello"
输出: "hello"

示例 2：
输入: "here"
输出: "here"

示例 3：
输入: "LOVELY"
输出: "lovely"
 */
public class ToLowerCase_709 {

    public static void main(String[] args){

        String str = "Hello";
        System.out.println(toLowerCase(str));
    }
    public static String toLowerCase(String str) {

        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='A' && c[i]<='Z')
                c[i]=(char)(c[i]-'A'+'a');
        }
        return String.valueOf(c);
    }
}
