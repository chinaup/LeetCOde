package Math.Easy;

import java.util.ArrayList;
import java.util.List;

/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:
输入: 121
输出: true

示例 2:
输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3:
输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。

进阶:
你能不将整数转为字符串来解决这个问题吗？
 */
public class PalindromeNumber_9 {

    public static void main(String[] args){

        int x = 11011;
        System.out.println(isPalindrome(x));
    }

//    public static boolean isPalindrome(int x) {
//
//        String s = String.valueOf(x);
//        char[] c = s.toCharArray();
//        int flag = 1;
//        for(int i=0;i<c.length;i++){
//            if(c[i]!=c[c.length-i-1])
//                flag=0;
//        }
//        if(flag==0) return false;
//        else return true;
//    }

    //不转换为字符串
    public static boolean isPalindrome(int x) {

        if(x<0) return false;
        int flag = 1;
        int x1 = x;
        List<Integer> l = new ArrayList<>();
        while(x>=10){
            int m = x%10;
            x = x/10;
            l.add(m);
        }
        l.add(x);

        for(int i=0;i<l.size();i++){
            int m = x1%10;
            x1 = x1/10;
            if(m!=l.get(l.size()-i-1))
                flag=0;
        }
        if(flag==0) return false;
        else return true;
    }
}
