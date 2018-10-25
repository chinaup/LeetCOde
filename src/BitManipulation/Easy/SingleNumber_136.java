package BitManipulation.Easy;

import java.util.HashSet;
import java.util.Set;

/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：
你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:
输入: [2,2,1]
输出: 1

示例 2:
输入: [4,1,2,1,2]
输出: 4
 */
public class SingleNumber_136 {

    public static void main(String[] args){

        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
//    public static int singleNumber(int[] nums) {
//
//        int sum1 = 0;
//        int sum2 = 0;
//        Set<Integer> s = new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            s.add(nums[i]);
//            sum1=sum1+nums[i];
//        }
//        for(int i:s)
//            sum2=sum2+i;
//        return sum2*2-sum1;
//    }
    //利用异或操作。异或的性质1：交换律a ^ b = b ^ a，性质2：0 ^ a = a。
    //于是利用交换律可以将数组假想成相同元素全部相邻，于是将所有元素依次做异或操作，
    //相同元素异或为0，最终剩下的元素就为Single Number。时间复杂度O(n)，空间复杂度O(1)
    public static int singleNumber(int[] nums){

        int res = 0;
        for(int i:nums){
            res=res^i;
        }
        return res;
    }
}
