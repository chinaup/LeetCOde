package Math.Easy;
/*
给定一个整数 n，返回 n! 结果尾数中零的数量。

示例 1:
输入: 3
输出: 0
解释: 3! = 6, 尾数中没有零。

示例 2:
输入: 5
输出: 1
解释: 5! = 120, 尾数中有 1 个零.

说明: 你算法的时间复杂度应为 O(log n) 。
 */
public class FactorialTrailingZeroes_172 {

    public static void main(String[] args){

        System.out.println(trailingZeroes(30));
    }

    //z = N/5 + N/5^2 + N/5^3+...+N/5^k
    public static int trailingZeroes(int n) {

        int sum = 0;
        while(n>0){
            sum=sum+n/5;
            n=n/5;
        }
        return sum;
    }
}
