package BitManipulation.Easy;

import java.math.BigInteger;

/*
颠倒给定的 32 位无符号整数的二进制位。

示例:
输入: 43261596
输出: 964176192
解释: 43261596 的二进制表示形式为 00000010100101000001111010011100 ，
     返回 964176192，其二进制表示形式为 00111001011110000010100101000000 。

进阶:
如果多次调用这个函数，你将如何优化你的算法？
 */
public class ReverseBits_190 {

    public static void main(String[] args){

        int n = 43261596;
        System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n) {

        int res = 0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){//取出第i位二进制数
                int j=31-i;
                res+=1<<j;
            }
        }
        return res;
    }
}
