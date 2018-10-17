package Array.Easy;
/*
    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。

示例 1:
输入: [1,3,5,6], 5
输出: 2

示例 2:
输入: [1,3,5,6], 2
输出: 1

示例 3:
输入: [1,3,5,6], 7
输出: 4

示例 4:
输入: [1,3,5,6], 0
输出: 0
 */
public class SearchInsertPosition_35 {

    public static void main(String[] args){

        int[] nums = {1,3,5,7,9,12};
        int target = 0;
        int position = searchInsertPosition(nums,target);
        System.out.println(position);
    }

    public static int searchInsertPosition(int[] nums,int target){

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==target) return i;
            else if(target>nums[i]&&target<nums[i+1]) return i+1;
        }

        if(target==nums[nums.length-1]) return nums.length-1;
        else if(target>nums[nums.length-1]) return nums.length;
        else return 0;
    }
}
