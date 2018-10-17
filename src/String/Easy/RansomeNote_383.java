package String.Easy;
/*
给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
如果可以构成，返回 true ；否则返回 false。
(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)

注意：
你可以假设两个字符串均只含有小写字母。

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
public class RansomeNote_383 {

    public static void main(String[] args){

        System.out.println(canConstruct("aa","ab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] c1 = ransomNote.toCharArray();
        char[] c2 = magazine.toCharArray();
        int num1 = 0;
        int num2 = 0;
        for(char i:c1)
            if(i==' ')
                num1++;
        for(char i:c2)
            if(i==' ')
                num2++;
        if(num1>num2)
            return false;

        for(int i=0;i<c1.length;i++){
            int flag = 0;
            if(c1[i]!=' '){
                for(int j=0;j<c2.length;j++){
                    if(c2[j]==c1[i]){
                        c2[j]=' ';
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                    return false;
            }
        }
        return true;
    }
}
