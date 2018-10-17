package Math.Easy;
/*
给定一个整数，写一个函数来判断它是否是 3 的幂次方。

示例 1:
输入: 27
输出: true

示例 2:
输入: 0
输出: false

示例 3:
输入: 9
输出: true

示例 4:
输入: 45
输出: false

进阶：
你能不使用循环或者递归来完成本题吗？
 */
public class PowerOfThree_326 {

    public static void main(String[] args){

        System.out.println(isPowerOfThree(6));
    }

    public static boolean isPowerOfThree(int n) {

        while(n>=3){
            if(n%3==0)
                n=n/3;
            else
                return false;
        }
        if(n==1) return true;
        else return false;
    }
}