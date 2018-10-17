package Array.Easy;
/*
    ����һ����Χ��  1 �� a[i] �� n ( n = �����С ) �� �������飬�����е�Ԫ��һЩ���������Σ���һЩֻ����һ�Ρ�
�ҵ������� [1, n] ��Χ֮��û�г����������е����֡�
�����ڲ�ʹ�ö���ռ���ʱ�临�Ӷ�ΪO(n)�������������������? ����Լٶ����ص����鲻���ڶ���ռ��ڡ�

ʾ��:
����:
[4,3,2,7,8,2,3,1]

���:
[5,6]
 */
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers_448 {

	//�������±�+1����һ��"������"�����ֵ��򽫶�Ӧ�±�+1���Ϊ������δ��ǵ��±�+1����δ���ֵ���
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++){
			int index = Math.abs(nums[i])-1;
		    if(nums[index] > 0)
		    	nums[index] = - nums[index];
		}
		for (int i = 0; i < nums.length; i++){
			if(nums[i] > 0){
				list.add(i + 1);
		    }
		}
		        return list;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1};
		List<Integer> al = findDisappearedNumbers(nums);
		for(Integer i : al){
			System.out.println(i);
		}
	}

}
