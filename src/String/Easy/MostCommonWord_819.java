package String.Easy;

import java.util.HashMap;
import java.util.Map;

/*
给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。
返回出现次数最多，同时不在禁用列表中的单词。题目保证至少有一个词不在禁用列表中，而且答案唯一。
禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。

示例：
输入:
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
输出: "ball"

解释:
"hit" 出现了3次，但它是一个禁用的单词。
"ball" 出现了2次 (同时没有其他单词出现2次)，所以它是段落里出现次数最多的，且不在禁用列表中的单词。

注意，所有这些单词在段落里不区分大小写，标点符号需要忽略（即使是紧挨着单词也忽略， 比如 "ball,"），
"hit"不是最终的答案，虽然它出现次数更多，但它在禁用单词列表中。
 */
public class MostCommonWord_819 {

    public static void main(String[] args){

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph,banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {

        char[] c = paragraph.toCharArray();
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<c.length;i++){
            if(c[i]>='A'&&c[i]<='Z')
                c[i]=(char)(c[i]-'A'+'a');
            else if(c[i]>'z'||c[i]<'a')
                c[i]=' ';
        }
        String[] str = String.valueOf(c).split("\\s{1,}");
        for(String s:str){
            if(map.get(s)!=null)
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
            System.out.println(s);
        }

        for(String s:banned){
            if(map.get(s)!=null)
                map.put(s,0);
        }
        String res = "";
        int max = 0;
        for(String key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                res=key;
            }
        }
        return res;
    }
}
