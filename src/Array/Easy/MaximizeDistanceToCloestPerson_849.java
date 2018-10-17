package Array.Easy;
/*
在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
至少有一个空座位，且至少有一人坐在座位上。
亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
返回他到离他最近的人的最大距离。

示例 1：
输入：[1,0,0,0,1,0,1]
输出：2
解释：
如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
因此，他到离他最近的人的最大距离是 2 。

示例 2：
输入：[1,0,0,0]
输出：3
解释：
如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
这是可能的最大距离，所以答案是 3 。

提示：
1 <= seats.length <= 20000
seats 中只含有 0 和 1，至少有一个 0，且至少有一个 1。
 */
public class MaximizeDistanceToCloestPerson_849 {

    public static void main(String[] args){

        int[] seats = {1,0,0,0};
        System.out.println(maxDistToClosest(seats));
    }

    public static int maxDistToClosest(int[] seats) {

        int max = 0;
        int max3 = 0;
        int max4 = 0;
        if(seats[0]==0){
            int m = 1;
            for(int i=1;i<seats.length;i++){
                if(seats[i]==0)
                    m++;
                else
                    break;
            }
            max3 = m;
        }
        if(seats[seats.length-1]==0){
            int m = 1;
            for(int i=seats.length-2;i>0;i--){
                if(seats[i]==0)
                    m++;
                else
                    break;
            }

            max4 = m;

        }
        max = Math.max(max3,max4);
        for(int i=1;i<seats.length-1;i++){
            int max1 = 1;
            int max2 = 1;
            if(seats[i]==0){
                for(int j=i+1;j<seats.length;j++){
                    if(seats[j]==0)
                        max1++;
                    else
                        break;
                }
                for(int k=i-1;k>0;k--){
                    if(seats[k]==0)
                        max2++;
                    else
                        break;
                }
            }
            max = Math.max(max,Math.min(max1,max2));
        }
        return max;
    }
}
