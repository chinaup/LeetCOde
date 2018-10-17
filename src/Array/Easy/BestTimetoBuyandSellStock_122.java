package Array.Easy;
/*
����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
ע���㲻���������Ʊǰ������Ʊ��

ʾ�� 1:
����: [7,1,5,3,6,4]
���: 5
����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
     ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�

ʾ�� 2:
����: [7,6,4,3,1]
���: 0
����: �����������, û�н������, �����������Ϊ 0��
 */
public class BestTimetoBuyandSellStock_122 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {10,5,8,4,14};
		int res = maxProfit(nums);
		System.out.println(res);
	}

	//��̬�滮��ά����������min�ǵ�ǰ��С������max�ǵ�ǰ�������
	private static int maxProfit(int[] nums) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]-min);
		}
		return max;
	}

}
