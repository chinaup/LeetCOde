package Math.Easy;
/*
����һ�� 32 λ�з����������������е����ֽ��з�ת��

ʾ�� 1:
����: 123
���: 321

ʾ�� 2:
����: -123
���: -321

ʾ�� 3:
����: 120
���: 21

ע��:
�������ǵĻ���ֻ�ܴ洢 32 λ�з�������������ֵ��Χ�� [?231,  231 ? 1]������������裬�����ת�������������򷵻� 0��
 */
import java.util.ArrayList;

public class ReverseInteger_7 {

	public static int reverse(int x){
		ArrayList<Integer> al = new ArrayList();
		int y;
		long n = 0;
		while(x!=0){
			y=x%10;
			x=x/10;
			al.add(y);
		}
		for(Integer i : al){
			n=n*10+i;
			//System.out.println(n);
			if(n>Integer.MAX_VALUE||n<Integer.MIN_VALUE)//ע��n��ȡֵ��Χ
				return 0;
		}
		return (int)n;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(21474836));
	}

}
