package Math.Easy;
/*
统计所有小于非负整数 n 的质数的数量。

示例:
输入: 10
输出: 4

解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class CountPrimes_204 {

    public static void main(String[] args){

        System.out.println(countPrimes(10));
    }

    //我们从2开始遍历到根号n，先找到第一个质数2，然后将其所有的倍数全部标记出来，
    // 然后到下一个质数3，标记其所有倍数，一次类推，直到根号n，此时数组中未被标记的数字就是质数。
    public static int countPrimes(int n) {

        if(n==0 || n==1) return 0;
        boolean[] b = new boolean[n-1];//建一个数组标记为true;
        for(int i=0;i<b.length;i++)
            b[i]=true;
        b[0]=false;
        for(int i=2;i*i<=n;i++){
            if(b[i-1]){
                for(int j=i*i;j<n;j=j+i)
                    b[j-1]=false;

            }
        }
        int sum = 0;
        for(int i=0;i<n-1;i++)
            if(b[i])
                sum++;
        return sum;
    }
}
