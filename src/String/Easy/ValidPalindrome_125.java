package String.Easy;

import java.util.ArrayList;
import java.util.List;

/*
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:
输入: "A man, a plan, a canal: Panama"
输出: true

示例 2:
输入: "race a car"
输出: false
 */
public class ValidPalindrome_125 {

    public static void main(String[] args){

        System.out.println(isPalindrome("race a car"));
    }
    public static boolean isPalindrome(String s) {

        List<Character> l = new ArrayList<>();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if((c[i]>='a'&&c[i]<='z')||(c[i]>='A'&&c[i]<='Z')||(c[i]>='0'&&c[i]<='9'))
                l.add(c[i]);
        }
        for(int i=0;i<(l.size()+1)/2;i++){
            if(l.get(i)>='0'&&l.get(i)<='9'){
                if(l.get(i)==l.get(l.size()-i-1))
                    continue;
                else
                    return false;
            }
            else{
                if((l.get(i)==l.get(l.size()-i-1))||Math.abs(l.get(i)-l.get(l.size()-i-1))==32)
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}
