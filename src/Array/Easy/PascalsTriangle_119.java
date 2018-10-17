package Array.Easy;
/*
给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:
输入: 3
输出: [1,3,3,1]

进阶：
你可以优化你的算法到 O(k) 空间复杂度吗？
 */
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_119 {

    public static void main(String[] args){

        int rowIndex = 3;
        List<Integer> l = getRow(rowIndex);
        for(Integer i:l){
            System.out.print(i+" ");
        }
    }

    //O(n^2)空间复杂度
//    public static List<Integer> getRow(int rowIndex) {
//
//        int numRows = rowIndex+1;
//        List<List<Integer>> l = new ArrayList();
//        if(numRows!=0){
//            List l0 = new ArrayList();
//            l0.add(1);
//            l.add(l0);
//        }
//        else
//            return new ArrayList<>();
//
//        for(int i=1;i<numRows;i++){
//            List ll = new ArrayList();
//            ll.add(1);
//            for(int j=1;j<i;j++){
//                int tmp = l.get(i-1).get(j-1)+l.get(i-1).get(j);
//                ll.add(tmp);
//            }
//            ll.add(1);
//            l.add(ll);
//
//        }
//        return l.get(rowIndex);
//    }
    //O(n)空间复杂度
    public static List<Integer> getRow(int rowIndex){

        List<Integer> l = new ArrayList();
        if(rowIndex<0) return l;
        l.add(1);
        for(int i=0;i<rowIndex;i++){
            for(int j=l.size()-2;j>=0;j--)
                l.set(j+1,l.get(j)+l.get(j+1));//不断向list中插入数，变成新的list
            l.add(1);
        }
        return l;
    }

}
