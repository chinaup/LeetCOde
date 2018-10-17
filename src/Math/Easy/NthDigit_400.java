package Math.Easy;

import java.util.ArrayList;
import java.util.List;

/*
在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。

注意:
n 是正数且在32为整形范围内 ( n < 231)。

示例 1:
输入:
3
输出:
3

示例 2:
输入:
11
输出:
0

说明:
第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 */
public class NthDigit_400 {

    public static void main(String[] args){

        System.out.println(findNthDigit(1000000000));
    }
    public static int findNthDigit(int n) {

        int i = 0;
        long sum = 0;
        while(n>sum){
            i++;
            sum=sum+(long)(9*Math.pow(10,i-1))*i;
        }
        for(int j=1;j<i;j++){
            n=n-9*(int)(Math.pow(10,j-1))*j;
        }
        int a = (n-1)/i;
        int b = (n-1)%i;
        int num = (int)(Math.pow(10,i-1))+a;

        List<Integer> l = new ArrayList<>();
        while(num>0){
            l.add(num%10);
            num=num/10;
        }
        return l.get(i-b-1);

    }
}
