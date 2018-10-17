package Array.Easy;
//使用二分查找降低时间复杂度
public class TwoSum_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] a = twosum(nums,target);
		for(int i : a)
			System.out.print(i+" ");
	}

	private static int[] twosum(int[] nums, int target) {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			j=binarySearch(nums,target-nums[i],i);
			if(j==-1)
				continue;
			else if(nums[i]+nums[j]==target){
				a[0]=i+1;
				a[1]=j+1;
			}
			
		}
		return a;
	}

	private static int binarySearch(int[] a, int key,int i) {
		// TODO Auto-generated method stub
		int high=a.length-1;
		int low=i+1;
		while(high>=low){
			int mid = (high+low)/2;
			if(key>a[mid]){
				low=mid+1;
			}
				
			else if(key<a[mid])
				high=mid-1;
			else
				return mid;
		}
		return -1;
		
	}

}
