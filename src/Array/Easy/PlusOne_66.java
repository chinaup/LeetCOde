package Array.Easy;
/*
   给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:
输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。

示例 2:
输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
 */
public class PlusOne_66 {

    public static void main(String[] args){

        int[] digits = {9,9,9,9};
        int[] res = plusOne(digits);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]);
    }


    public static int[] plusOne(int[] digits) {

        digits[digits.length-1]++;
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++;
            }
        }
        if(digits[0]==10){
            int[] res = new int[digits.length+1];
            res[0]=1;res[1]=0;
            for(int i=2;i<res.length;i++)
                res[i]=digits[i-1];
            return res;
        }
        else
            return digits;
    }
}
