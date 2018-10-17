package Math.Easy;
/*
给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。

示例1:

输入: 5
输出: True
解释: 1 * 1 + 2 * 2 = 5


示例2:

输入: 3
输出: False
 */
public class SumOfSquareNumbers_633 {

    public static void main(String[] args){

        System.out.println(judgeSquareSum(5));
    }
    //我们可以从c的平方根，注意即使c不是平方数，也会返回一个整型数。
    //然后我们判断如果i*i等于c，说明c就是个平方数，只要再凑个0，就是两个平方数之和，返回true；
    //如果不等于的话，那么算出差值c - i*i，如果这个差值也是平方数的话，返回true。遍历结束后返回false
    public static boolean judgeSquareSum(int c) {

        for(int i=(int)Math.sqrt(c);i>=0;i--){
            if(i*i==c) return true;
            int d=c-i*i; int k=(int)Math.sqrt(d);
            if(k*k==d) return true;
        }
        return false;

    }
}
