package String.Easy;
/*
编写一个函数，其作用是将输入的字符串反转过来。

示例 1:
输入: "hello"
输出: "olleh"

示例 2:
输入: "A man, a plan, a canal: Panama"
输出: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseString_344 {

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {

        char[] c = s.toCharArray();

        for(int i=0;i<c.length/2;i++){
            char tmp=c[i];
            c[i]=c[c.length-i-1];
            c[c.length-i-1]=tmp;
        }

        return String.valueOf(c);
    }

}
