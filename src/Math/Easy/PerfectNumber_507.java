package Math.Easy;


import java.util.ArrayList;
import java.util.List;

/*
对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False

示例：
输入: 28
输出: True
解释: 28 = 1 + 2 + 4 + 7 + 14
 */
public class PerfectNumber_507 {

    public static void main(String[] args){

        System.out.println(checkPerfectNumber(28));
    }
    //我们找其他因子的范围是[2, sqrt(n)]。
    // 我们遍历这之间所有的数字，如果可以被n整除，那么我们把i和num/i都加上，
    // 对于n如果是平方数的话，那么我们此时相同的因子加来两次，所以我们要减掉一次。
    public static boolean checkPerfectNumber(int num) {

        if(num==1) return false;
        int sum = 1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                sum=sum+i+(num/i);
            if(i*i==num)
                sum=sum-i;
        }
        if(sum==num) return true;
        else return false;
    }
}
