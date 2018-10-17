package String.Easy;
/*
给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。

示例 1:
输入: "abab"
输出: True
解释: 可由子字符串 "ab" 重复两次构成。

示例 2:
输入: "aba"
输出: False

示例 3:
输入: "abcabcabcabc"
输出: True
解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 */
public class RepeatedSubStringPattern_459 {

    public static void main(String[] args){

        System.out.println(repeatedSubstringPattern("aac"));
    }
    public static boolean repeatedSubstringPattern(String s) {

        for(int i=1;i<=s.length()/2;i++){
            if(s.length()%i==0){
                String s1 = s.substring(0,i);

                int k=i;
                int flag=1;

                while(k<s.length()){
                    String s2=s.substring(k,k+i);
                    if(s1.compareTo(s2)!=0)
                        flag=0;
                    k=k+i;
                }
                if(flag==1)
                    return true;
            }
        }

        return false;
    }
}
