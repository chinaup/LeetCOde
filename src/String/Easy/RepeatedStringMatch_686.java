package String.Easy;
/*
给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。

举个例子，
A = "abcd"，B = "cdabcdab"。
答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。

注意:
 A 与 B 字符串的长度在1和10000区间范围内。
 */
public class RepeatedStringMatch_686 {

    public static void main(String[] args){

        System.out.println(repeatedStringMatch("a","a"));
    }
    public static int repeatedStringMatch(String A, String B) {

        int al=A.length();
        int bl=B.length();
        int n=bl/al+2;
        String tmp=A;
        if(isSubstring(A,B)) return 1;
        for(int i=1;i<=n;i++){
            tmp=tmp+A;
            System.out.println(tmp);
            if(isSubstring(tmp,B))
                return i+1;
        }
        return -1;
    }
    public static boolean isSubstring(String A,String B){
        for(int i=0;i<=A.length()-B.length();i++){
            if(A.substring(i,i+B.length()).compareTo(B)==0)
                return true;
        }
        return false;
    }
}
