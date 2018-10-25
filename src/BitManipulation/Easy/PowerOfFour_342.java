package BitManipulation.Easy;
/*
给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。

示例 1:
输入: 16
输出: true

示例 2:
输入: 5
输出: false

进阶：
你能不使用循环或者递归来完成本题吗？
 */
public class PowerOfFour_342 {

    public static void main(String[] args){

        int num = 64;
        System.out.println(isPowerOfFour(num));
    }
//    public static boolean isPowerOfFour(int num) {
//
//        if(num==1) return true;
//        while(num>4){
//            if(num%4==0)
//                num=num/4;
//            else
//                return false;
//        }
//        if(num==4) return true;
//        else return false;
//    }

    //我们知道num & (num - 1)可以用来判断一个数是否为2的次方数，
    //更进一步说，就是二进制表示下，只有最高位是1，那么由于是2的次方数，不一定是4的次方数，
    //比如8，所以我们还要其他的限定条件，我们仔细观察可以发现，4的次方数的最高位的1都是计数位，
    //那么我们只需与上一个数(0x55555555) <==> 1010101010101010101010101010101，
    //如果得到的数还是其本身，则可以肯定其为4的次方数：
    public static boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1))==0 && (num & 0x55555555) == num;
    }
}
