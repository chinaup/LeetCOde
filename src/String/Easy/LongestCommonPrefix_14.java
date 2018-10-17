package String.Easy;
/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

说明:
所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix_14 {

    public static void main(String[] args){

        String[] strs = {"aca","caa"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {

        if(strs.length==0) return "";
        char[][] c = new char[strs.length][];
        for(int i=0;i<strs.length;i++){
            c[i]=strs[i].toCharArray();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<c.length;i++){
            if(c[i].length<min)
                min=c[i].length;
        }
        int count = 0;
        for(int i=0;i<min;i++){
            int flag=1;
            for(int j=0;j<c.length;j++){
                if(c[j][i]!=c[0][i])
                    flag=0;
            }
            if(flag==1)
                count++;
            else
                break;
        }

        String s = "";
        if(count==0)
            return s;

        for(int i=0;i<count;i++)
            s=s+c[0][i];

        return s;
    }
}



















