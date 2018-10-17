package Array.Easy;
/*
给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。

示例 1:
输入: [1,2,3]
输出: 6

示例 2:
输入: [1,2,3,4]
输出: 24

注意:
给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 */
import java.util.Arrays;

public class MaximumProductofThreeNumbers_628 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,-2,-3,-4,-5};
		int res = maxProduct(nums);
		System.out.println(res);
	}

	public static int maxProduct(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		int N = nums.length-1;
		int count = 0;
		for (int i = 0; i < nums.length; i++) 
			if(nums[i]>=0)
				count++;
		if(count==0)
			return nums[N]*nums[N-1]*nums[N-2];
		else if(count==1)
			return nums[0]*nums[1]*nums[N];
		else if(count==2)
			return nums[0]*nums[1]*nums[N];
		else
			return Math.max(nums[0]*nums[1]*nums[N], nums[N]*nums[N-1]*nums[N-2]);
	}

}
