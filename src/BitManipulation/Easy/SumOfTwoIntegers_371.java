package BitManipulation.Easy;
/*
不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。

示例 1:
输入: a = 1, b = 2
输出: 3

示例 2:
输入: a = -2, b = 3
输出: 1
 */
public class SumOfTwoIntegers_371 {

    public static void main(String[] args){

        System.out.println(getSum(-2,5));
    }
    public static int getSum(int a, int b) {

        int res = 0;
        int xor = a^b;
        int forward = (a&b)<<1;

        if(forward!=0)
            res=getSum(xor,forward);
        else
            res=xor;

        return res;

    }
}
