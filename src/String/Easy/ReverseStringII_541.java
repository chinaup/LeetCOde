package String.Easy;
/*
给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
如果剩余少于 k 个字符，则将剩余的所有全部反转。
如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。

示例:
输入: s = "abcdefg", k = 2
输出: "bacdfeg"

要求:
该字符串只包含小写的英文字母。
给定字符串的长度和 k 在[1, 10000]范围内。
 */
public class ReverseStringII_541 {

    public static void main(String[] args){

        System.out.println(reverseStr("abcdefg",2));
    }
    public static String reverseStr(String s, int k) {

        char[] c = s.toCharArray();
        int index = 0;
        int remain = c.length;
        while(true){
            if(remain>=2*k){
                reverse(c,index,k);
                index=index+2*k;
                remain=remain-2*k;
            }
            else if(remain>=k && remain<2*k){
                reverse(c,index,k);
                break;
            }
            else if(remain<k){
                reverse(c,index,remain);
                break;
            }
        }
        return String.valueOf(c);
    }
    public static void reverse(char[] c,int index,int k){
        for(int i=index;i<index+k/2;i++){
            char tmp=c[i];
            c[i]=c[2*index+k-i-1];
            c[2*index+k-i-1]=tmp;
        }
    }
}
