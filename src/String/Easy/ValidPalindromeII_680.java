package String.Easy;

import java.util.ArrayList;
import java.util.List;

/*
给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。

示例 1:
输入: "aba"
输出: True

示例 2:
输入: "abca"
输出: True

解释: 你可以删除c字符。
注意:
字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 */
public class ValidPalindromeII_680 {

    public static void main(String[] args){
        System.out.println(validPalindrome("cbbcc"));
    }

    public static boolean validPalindrome(String s) {

        char[] c = s.toCharArray();
        List<Character> l = new ArrayList<>();
        for(char i:c)
            l.add(i);
        List<Character> l1 = new ArrayList<>();
        for(char i:c)
            l1.add(i);

        if(check(l)) return true;
        //找到不是回文的位置删除
        for(int i=0;i<l.size()/2;i++){
            if(l.get(i)!=l.get(l.size()-i-1)){
                l.remove(i);
                l1.remove(l1.size()-i-1);
                break;
            }
        }
        if(check(l)||check(l1))
            return true;
        else return false;

    }
    public static boolean check(List l){
        for(int i=0;i<l.size()/2;i++){
            if(l.get(i)!=l.get(l.size()-i-1))
                return false;
        }
        return true;
    }
}
