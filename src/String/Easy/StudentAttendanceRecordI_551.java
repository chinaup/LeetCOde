package String.Easy;
/*
给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
'A' : Absent，缺勤
'L' : Late，迟到
'P' : Present，到场

如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
你需要根据这个学生的出勤纪录判断他是否会被奖赏。

示例 1:
输入: "PPALLP"
输出: True

示例 2:
输入: "PPALLL"
输出: False
 */
public class StudentAttendanceRecordI_551 {

    public static void main(String[] args){

        System.out.println(checkRecord("LLLPPALLPLL"));
    }
    public static boolean checkRecord(String s) {

        char[] c = s.toCharArray();
        int a = 0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='A')
                a++;
        }

        if(a>=2)
            return false;
        else{
            int l = 1;
            int maxL = 0;
            int i=0;
            while(i<c.length-1){
                if(c[i]=='L'&&c[i+1]=='L')
                    l++;
                else
                    l=1;
                maxL=Math.max(l,maxL);
                i++;
            }
            if(maxL>2) return false;
            else return true;
        }
    }
}
