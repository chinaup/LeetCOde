package Array.Easy;
/*
给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。

示例 1:
输入: [3,0,1]
输出: 2

示例 2:
输入: [9,6,4,2,3,5,7,0,1]
输出: 8

说明:
你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
public class MissingNumber_268 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4,5};
		System.out.println(missingNumber(nums));
	}

	private static int missingNumber(int[] nums) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum+nums[i];
		}
		for (int i = 0; i <= nums.length; i++) {
			num = num+i;
		}
		return num-sum;
	}

}
