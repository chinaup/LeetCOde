package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
你找到的子数组应是最短的，请输出它的长度。

示例 1:
输入: [2, 6, 4, 8, 10, 9, 15]
输出: 5
解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。

说明 :
输入的数组长度范围在 [1, 10,000]。
输入的数组可能包含重复元素 ，所以升序的意思是<=。
 */
public class ShortestUnsortedContinuousSubarray_581 {

    public static void main(String[] args) {

        int[] nums = {2, 6, 4, 8, 10, 9, 15,8};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {

        int[] tmp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            tmp[i]=nums[i];
        }
        Arrays.sort(nums);
        int n = 0;
        List<Integer> l = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=tmp[i])
                l.add(i);
        }
        if(l.isEmpty())
            return 0;
        else
            return l.get(l.size()-1)-l.get(0)+1;
    }
}
