package String.Easy;
/*
给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。

示例 1：
输入： A = "ab", B = "ba"
输出： true

示例 2：
输入： A = "ab", B = "ab"
输出： false

示例 3:
输入： A = "aa", B = "aa"
输出： true

示例 4：
输入： A = "aaaaaaabc", B = "aaaaaaacb"
输出： true

示例 5：
输入： A = "", B = "aa"
输出： false

提示：
0 <= A.length <= 20000
0 <= B.length <= 20000
A 和 B 仅由小写字母构成。
 */
public class BuddyStrings_859 {

    public static void main(String[] args){

        System.out.println(buddyStrings("aaaaaaabc","aaaaaaacb"));
    }
    public static boolean buddyStrings(String A, String B) {

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        if (A.length() != B.length())
            return false;
        else if (A.compareTo(B) == 0) {
            for (int i = 0; i < a.length - 1; i++)
                for (int j = i + 1; j < a.length; j++)
                    if (a[i] == a[j])
                        return true;
        }
        else {
            int index1 = -1;
            int index2 = -1;
            int i = 0;
            while (i < a.length) {
                if (a[i] != b[i]){
                    index1 = i;
                    break;
                }
                i++;
            }
            i++;
            while (i < a.length) {
                if (a[i] != b[i])
                    index2 = i;
                i++;
            }
            System.out.println(index1);
            System.out.println(index2);
            if (index2 != -1) {
                char tmp = a[index1];
                a[index1] = a[index2];
                a[index2] = tmp;
                if (String.valueOf(a).compareTo(B) == 0)
                    return true;
            }
        }
        return false;
    }
}




























