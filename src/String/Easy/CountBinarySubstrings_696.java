package String.Easy;

import java.util.ArrayList;
import java.util.List;

/*
给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
重复出现的子串要计算它们出现的次数。

示例 1 :
输入: "00110011"
输出: 6
解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。

请注意，一些重复出现的子串要计算它们出现的次数。

另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。

示例 2 :
输入: "10101"
输出: 4
解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。

注意：
s.length 在1到50,000之间。
s 只包含“0”或“1”字符。
 */
public class CountBinarySubstrings_696 {
    public static void main(String[] args){

        System.out.println(countBinarySubstrings("1100101"));
    }
    /*
    就是统计连续的0或者1的个数存进一个数组，那么总的组合数就是相邻的个数的最小值的加和。
    举个例子来说：
    比如001101000这个字符串，那么统计数组中的值应该是2,2,1,1,3
    那么总的次数就是min（2,2）+min（2,1）+min（1,1）+min（1,3），
    因为要找的是1和0相等的组合，所以一定在交界处出现，并且个数等于0和1中最小的那个，
    比如00011那么0的个数右3个，1的个数有2个，那么组合就有01,0011这两个，因为再多了1的个数就不够用了，
    所以个数是min（3,2）.
     */
    public static int countBinarySubstrings(String s) {

        int count = 0;
        int i = 0;
        int len = 1;
        List<Integer> l = new ArrayList<>();
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1))
                len++;
            else{
                l.add(len);
                len=1;
            }
            i++;
        }
        l.add(len);
        System.out.println(l);
        for(int j=0;j<l.size()-1;j++){
            count+=Math.min(l.get(j),l.get(j+1));
        }
        return count;
    }
}
