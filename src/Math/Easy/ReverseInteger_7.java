package Math.Easy;
/*
给定一个 32 位有符号整数，将整数中的数字进行反转。

示例 1:
输入: 123
输出: 321

示例 2:
输入: -123
输出: -321

示例 3:
输入: 120
输出: 21

注意:
假设我们的环境只能存储 32 位有符号整数，其数值范围是 [?231,  231 ? 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
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
			if(n>Integer.MAX_VALUE||n<Integer.MIN_VALUE)//注意n的取值范围
				return 0;
		}
		return (int)n;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(21474836));
	}

}
