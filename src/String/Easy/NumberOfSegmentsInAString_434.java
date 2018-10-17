package String.Easy;
/*
统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
请注意，你可以假定字符串里不包括任何不可打印的字符。

示例:
输入: "Hello, my name is John"
输出: 5
 */
public class NumberOfSegmentsInAString_434 {

    public static void main(String[] args){

        System.out.println(countSegments("Hello, my name is John"));
    }
    public static int countSegments(String s) {

        char[] c = s.toCharArray();
        int i = 0;
        int count = 0;
        while(i<c.length){
            if(c[i]!=' '){
                int k=1;
                while(k<c.length-i){
                    if(c[i+k]!=' ')
                        k++;
                    else
                        break;
                }
                i=i+k+1;
                count++;
            }
            else
                i++;
        }
        return count;
    }
}
