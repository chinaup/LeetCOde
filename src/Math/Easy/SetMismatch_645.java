package Math.Easy;

import java.util.HashSet;
import java.util.Set;

/*
集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

示例 1:
输入: nums = [1,2,2,4]
输出: [2,3]

注意:
给定数组的长度范围是 [2, 10000]。
给定的数组是无序的。
 */
public class SetMismatch_645 {

    public static void main(String[] args){

        int[] nums = {3,2,2};
        int[] res = findErrorNums(nums);
        for(int i:res)
            System.out.println(i);
    }

    public static int[] findErrorNums(int[] nums) {

        int[] res = new int[2];
        Set<Integer> s = new HashSet<>();
        for(int i:nums)
            s.add(i);
        int sum1 = (1+nums.length)*nums.length/2;
        int sum2 = 0;
        int sum3 = 0;
        for(int i:s)
            sum2=sum2+i;
        for(int i:nums)
            sum3=sum3+i;
        res[0]=sum3-sum2;
        res[1]=sum1-sum2;

        return res;

    }

}
