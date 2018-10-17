package Math.Easy;
/*
实现 int sqrt(int x) 函数。
计算并返回 x 的平方根，其中 x 是非负整数。
由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:
输入: 4
输出: 2

示例 2:
输入: 8
输出: 2

说明: 8 的平方根是 2.82842...,
     由于返回类型是整数，小数部分将被舍去。
 */
public class Sqrt_x_69 {

    public static void main(String[] args){

        System.out.println(mySqrt(2147483647));
    }

    //使用二分法查找
    public static int mySqrt(int x) {

        int left = 0;
        int right = 46341;
        long mid = (left+right)/2; //防止溢出
        while(left<=right){
            if(x==mid*mid)
                return (int)mid;
            else if(x>mid*mid){
                left=(int)mid+1;
                mid=(left+right)/2;
            }
            else if(x<mid*mid){
                right=(int)mid-1;
                mid=(left+right)/2;
            }
        }
        int tmp = right*right;
        if(tmp>x) return right-1;
        else return right;

    }

}
