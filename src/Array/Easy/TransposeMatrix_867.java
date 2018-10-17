package Array.Easy;
/*
给定一个矩阵 A， 返回 A 的转置矩阵。
矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。

示例 1：
输入：[[1,2,3],[4,5,6],[7,8,9]]
输出：[[1,4,7],[2,5,8],[3,6,9]]

示例 2：
输入：[[1,2,3],[4,5,6]]
输出：[[1,4],[2,5],[3,6]]

提示：
1 <= A.length <= 1000
1 <= A[0].length <= 1000
 */
import java.util.ArrayList;
import java.util.List;

public class TransposeMatrix_867 {

    public static void main(String[] args){

        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = transpose(A);
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] A) {

        int[][] B = new int[A[0].length][A.length];
        List<Integer> l = new ArrayList();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                l.add(A[i][j]);
            }
        }
        int k = 0;
        for(int i=0;i<A.length;i++)
            for(int j=0;j<A[0].length;j++){
                B[j][i]=l.get(k);
                k++;
            }
        return B;
    }
}
