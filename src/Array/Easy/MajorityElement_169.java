package Array.Easy;
/*
����һ����СΪ n �����飬�ҵ����е�������������ָ�������г��ִ������� ? n/2 ? ��Ԫ�ء�
����Լ��������Ƿǿյģ����Ҹ������������Ǵ���������

ʾ�� 1:
����: [3,2,3]
���: 3

ʾ�� 2:
����: [2,2,1,1,1,2,2]
���: 2
 */
public class MajorityElement_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,1,1,2,2,2,2};
		System.out.println(majorityElement(nums));
	}

    //Moore voting algorithm--ÿ�ҳ�������ͬ��element���ͳɶ�ɾ����count--������ʣ�µ�һ����������ġ�ʱ�临�Ӷȣ�O(n)
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
