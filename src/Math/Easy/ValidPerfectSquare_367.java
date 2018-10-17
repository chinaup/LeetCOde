package Math.Easy;
/*
给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
说明：不要使用任何内置的库函数，如  sqrt。

示例 1：
输入：16
输出：True

示例 2：
输入：14
输出：False
 */
public class ValidPerfectSquare_367 {

    public static void main(String[] args){

        System.out.println(isPerfectSquare(808201));
    }

    //二分法降低时间复杂度，right设为46341
    public static boolean isPerfectSquare(int num) {

        if(num==1) return true;
        int flag=0;
        int left=1;
        int right=46341;

        while(left<=right){
            int mid=(right+left)/2;
            long tmp=mid*mid;
            if((tmp==num)){
                flag=1;
                break;
            }
            else if(tmp<num)
                left=mid+1;
            else if(tmp>num)
                right=mid-1;
        }
        if(flag==1) return true;
        else return false;
    }
}
