package BitManipulation.Easy;
/*
编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。

示例 :
输入: 11
输出: 3
解释: 整数 11 的二进制表示为 00000000000000000000000000001011

示例 2:
输入: 128
输出: 1
解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 */
public class Numberof1Bits_191 {

    public static void main(String[] args){

        int n = 128;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {

        int count = 0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1)
                count++;
        }
        return count;
    }
}
