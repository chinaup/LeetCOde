package String.Easy;
/*
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

案例:
s = "leetcode"
返回 0.

s = "loveleetcode",
返回 2.

注意事项：您可以假定该字符串只包含小写字母。
 */
public class FirstUniqueCharacterInAString_387 {

    public static void main(String[] args){

        System.out.println(firstUniqChar(""));
    }
    public static int firstUniqChar(String s) {

        char[] c = s.toCharArray();
        if(c.length==0) return -1;
        if(c.length==1) return 0;
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=' '){
                int flag=0;
                for(int j=i+1;j<c.length;j++){
                    if(c[i]==c[j]){
                        flag=1;
                        c[j]=' ';
                    }
                }
                if(flag==1)
                    c[i]=' ';
                else if(flag==0)
                    return i;
            }
        }
        if(c[c.length-1]==' ')
            return -1;
        else
            return c.length-1;
    }

}
