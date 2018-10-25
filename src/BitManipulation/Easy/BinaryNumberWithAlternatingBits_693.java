package BitManipulation.Easy;
/*
给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。

示例 1:
输入: 5
输出: True
解释:
5的二进制数是: 101

示例 2:
输入: 7
输出: False
解释:
7的二进制数是: 111

示例 3:
输入: 11
输出: False
解释:
11的二进制数是: 1011

示例 4:
输入: 10
输出: True
解释:
10的二进制数是: 1010
 */
public class BinaryNumberWithAlternatingBits_693 {

    public static void main(String[] args){

        System.out.println(hasAlternatingBits(20));
    }
    public static boolean hasAlternatingBits(int n) {

        int[] a = new int[32];
        for(int i=0;i<32;i++){
            a[i]=(n>>i)&1;
        }
        int index = 0;
        for(int i=31;i>=0;i--){
            if(a[i]!=0){
                index=i;
                break;
            }
        }

        int i=0;
        while(i<index){
            if(a[i]==a[i+1])
                return false;
            else
                i++;
        }
        return true;

    }
}
