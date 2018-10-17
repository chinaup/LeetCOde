package Math.Easy;

import java.util.Arrays;

/*
给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。

示例:

输入:
[1,2,3]
输出:
3

解释:
只需要3次移动（注意每次移动会增加两个元素的值）：

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class MinimumMovesToEqualArrayElements_453 {

    public static void main(String[] args){

        int[] nums = {1,2,3,4};
        System.out.println(minMoves(nums));
    }

    //其实给n-1个数字加1，效果等同于给那个未被选中的数字减1，
    //比如数组[1，2，3], 给除去最大值的其他数字加1，变为[2，3，3]，
    //我们全体减1，并不影响数字间相对差异，变为[1，2，2]，这个结果其实就是原始数组的最大值3自减1，
    //那么问题也可能转化为，将所有数字都减小到最小值，这样难度就大大降低了，
    //我们只要先找到最小值，然后累加每个数跟最小值之间的差值即可
    public static int minMoves(int[] nums) {

        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)
                min=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            count=count+(nums[i]-min);
        }

        return count;
    }

}
