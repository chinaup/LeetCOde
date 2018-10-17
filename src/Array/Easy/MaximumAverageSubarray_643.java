package Array.Easy;
/*
给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。

示例 1:
输入: [1,12,-5,-6,50,3], k = 4
输出: 12.75

解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75

注意:
1 <= k <= n <= 30,000。
所给数据范围 [-10,000，10,000]。
 */
public class MaximumAverageSubarray_643 {

    public static void main(String[] args){

        int[] nums = {-1};
        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }

    public static double findMaxAverage(int[] nums, int k) {

        double max = -Double.MAX_VALUE;
        System.out.println(max);
        for(int i=0;i<=nums.length-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum = sum+nums[j];
            }
            if((double)sum/k>max)
                max = (double)sum/k;
        }
        return max;
    }
}
