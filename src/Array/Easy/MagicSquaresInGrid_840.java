package Array.Easy;

import java.util.Arrays;

/*
3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
给定一个由整数组成的 N × N 矩阵，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。

示例 1:
输入: [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
输出: 1
解释:
下面的子矩阵是一个 3 x 3 的幻方：
438
951
276

而这一个不是：
384
519
762

总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。

提示:
1 <= grid.length = grid[0].length <= 10
0 <= grid[i][j] <= 15
 */
public class MagicSquaresInGrid_840 {

    public static void main(String[] args){

        int[][] grid = {{4,3,8,4},{9,5,1,9},{2,7,6,2},{1,1,1,1}};
        System.out.println(numMagicSquaresInside(grid));
    }

    public static int numMagicSquaresInside(int[][] grid) {

        int M = grid.length;
        if(M<3) return 0;
        int sum = 0;
        for(int i=0;i<M-2;i++){
            for(int j=0;j<M-2;j++){
                int[][] tmp = {{grid[i][j],grid[i][j+1],grid[i][j+2]},{grid[i+1][j],grid[i+1][j+1],grid[i+1][j+2]},{grid[i+2][j],grid[i+2][j+1],grid[i+2][j+2]}};
                if(check(tmp))
                    sum++;
            }
        }
        return sum;
    }

    public static boolean check(int[][] tmp){
        int flag = 1;

        int n1 = tmp[0][0]+tmp[0][1]+tmp[0][2];
        int n2 = tmp[1][0]+tmp[1][1]+tmp[1][2];
        int n3 = tmp[2][0]+tmp[2][1]+tmp[2][2];
        int n4 = tmp[0][0]+tmp[1][0]+tmp[2][0];
        int n5 = tmp[0][1]+tmp[1][1]+tmp[2][1];
        int n6 = tmp[0][2]+tmp[1][2]+tmp[2][2];
        int n7 = tmp[0][0]+tmp[1][1]+tmp[2][2];
        int n8 = tmp[0][2]+tmp[1][1]+tmp[2][0];

        int[] nums = {tmp[0][0],tmp[0][1],tmp[0][2],tmp[1][0],tmp[1][1],tmp[1][2],tmp[2][0],tmp[2][1],tmp[2][2]};

        if(n1==n2 && n2==n3 && n3==n4 && n4==n5 && n5==n6 && n6==n7 && n7==n8){
            Arrays.sort(nums);
            for(int i=0;i<9;i++){
                if(nums[i]!=i+1)
                    flag=0;
            }
        }
        else flag=0;
        if(flag==0) return false;
        else return true;
    }
}
