package Array.Easy;
/*
给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ? n/2 ? 的元素。
你可以假设数组是非空的，并且给定的数组总是存在众数。

示例 1:
输入: [3,2,3]
输出: 3

示例 2:
输入: [2,2,1,1,1,2,2]
输出: 2
 */
public class MajorityElement_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,1,1,2,2,2,2};
		System.out.println(majorityElement(nums));
	}

    //Moore voting algorithm--每找出两个不同的element，就成对删除即count--，最终剩下的一定就是所求的。时间复杂度：O(n)
	private static int majorityElement(int[] nums) {

		int elem = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++)  {
            
           if(count == 0)  {
               elem = nums[i];
               count = 1;
           }
           else    {
               if(elem == nums[i])
                   count++;
               else
                   count--;
           }
           
       }
       return elem;
	}

}
