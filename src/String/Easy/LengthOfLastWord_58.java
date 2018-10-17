package String.Easy;
/*
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:
输入: "Hello World"
输出: 5
 */
public class LengthOfLastWord_58 {
    public static void main(String[] args){
        String s = "";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        if(s.length()==0) return 0;
        char[] c = s.toCharArray();
        int length=0;
        int index=0;
        for(int i=0;i<c.length;i++){
            if(c[i]!=' ')
                index=i;
        }
        for(int j=index;j>=0;j--){
            if(c[j]!=' ')
                length++;
            else
                break;
        }
        return length;
    }
}
