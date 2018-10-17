package String.Easy;


/*
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:
输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc"

注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWordsInAString_557 {

    public static void main(String[] args){

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {

        char[] c = s.toCharArray();
        int i = 0;
        while(i<c.length){
            int l=0;
            int j=i;
            while(j<c.length){
                if(c[j]!=' '){
                    l++;
                    j++;
                }
                else
                    break;
            }
            reverse(c,i,l);
            i=i+l+1;
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
