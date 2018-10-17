package Array.Easy;
/*
给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {

    public static void main(String[] args){

        int numRows = 5;
        List<List<Integer>> l = generate(numRows);

        for(List<Integer> ll:l){
            for(Integer i:ll){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }




    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> l = new ArrayList();
        if(numRows!=0){
            List l0 = new ArrayList();
            l0.add(1);
            l.add(l0);
        }

        for(int i=1;i<numRows;i++){
            List ll = new ArrayList();
            ll.add(1);
            for(int j=1;j<i;j++){
                int tmp = l.get(i-1).get(j-1)+l.get(i-1).get(j);
                ll.add(tmp);
            }
            ll.add(1);
            l.add(ll);
        }
        return l;
    }

}


