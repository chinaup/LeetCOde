package Math.Easy;

import java.util.ArrayList;
import java.util.List;

/*
给定两个二进制字符串，返回他们的和（用二进制表示）。
输入为非空字符串且只包含数字 1 和 0。

示例 1:
输入: a = "11", b = "1"
输出: "100"

示例 2:
输入: a = "1010", b = "1011"
输出: "10101"
 */
public class AddBinary_67 {

    public static void main(String[] args){

        System.out.println(addBinary("100","110010"));
    }

    public static String addBinary(String a, String b) {

        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int[] c1 = new int[ca.length];
        int[] c2 = new int[cb.length];
        for(int i=0;i<ca.length;i++)
            c1[i]=(int)ca[i]-(int)'0';
        for(int i=0;i<cb.length;i++)
            c2[i]=(int)cb[i]-(int)'0';
        List<Integer> l = new ArrayList();
        int x = c1.length-1;
        int y = c2.length-1;
        int flag = 0;
        while(x>=0&&y>=0){
            if(c1[x]+c2[y]+flag==0){
                x--;
                y--;
                flag=0;
                l.add(0);
            }
            else if(c1[x]+c2[y]+flag==1){
                x--;
                y--;
                flag=0;
                l.add(1);
            }
            else if(c1[x]+c2[y]+flag==2){
                x--;
                y--;
                flag=1;
                l.add(0);
            }
            else if(c1[x]+c2[y]+flag==3){
                x--;
                y--;
                flag=1;
                l.add(1);
            }
        }
        if(x<0&y<0&&flag==1)
            l.add(1);
        if(x>=0){
            for(int i=x;i>=0;i--){
                if(c1[i]+flag==0){
                    l.add(0);
                    flag=0;
                }
                else if(c1[i]+flag==1){
                    l.add(1);
                    flag=0;
                }
                else if(c1[i]+flag==2){
                    l.add(0);
                    flag=1;
                }
            }
            if(flag==1)
                l.add(1);

        }
        if(y>=0){
            for(int i=y;i>=0;i--){
                if(c2[i]+flag==0){
                    l.add(0);
                    flag=0;
                }
                else if(c2[i]+flag==1){
                    l.add(1);
                    flag=0;
                }
                else if(c2[i]+flag==2){
                    l.add(0);
                    flag=1;
                }
            }
            if(flag==1)
                l.add(1);

        }
        String s = "";
        for(int i=l.size()-1;i>=0;i--)
            s=s+l.get(i);
        return s;
    }
}
