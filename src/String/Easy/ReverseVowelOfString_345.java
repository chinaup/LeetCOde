package String.Easy;

import java.util.ArrayList;
import java.util.List;

/*
编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

示例 1:
输入: "hello"
输出: "holle"

示例 2:
输入: "leetcode"
输出: "leotcede"

说明:
元音字母不包含字母"y"。
 */
public class ReverseVowelOfString_345 {

    public static void main(String[] args){

        System.out.println(reverseVowels(""));

    }
    public static String reverseVowels(String s) {

        char[] c = s.toCharArray();
        List<Character> l = new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
                l.add(c[i]);
        }
        int k=0;
        for(int i=c.length-1;i>=0;i--){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                c[i]=l.get(k);
                k++;
            }
        }
        String s1 = "";
        for(char i:c)
            s1+=i;
        return s1;
    }
}
