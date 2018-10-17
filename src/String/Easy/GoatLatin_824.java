package String.Easy;
/*
给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。

山羊拉丁文的规则如下：
如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
例如，单词"apple"变为"applema"。

如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
例如，单词"goat"变为"oatgma"。

根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。

返回将 S 转换为山羊拉丁文后的句子。

示例 1:
输入: "I speak Goat Latin"
输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

示例 2:
输入: "The quick brown fox jumped over the lazy dog"
输出: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

说明:
S 中仅包含大小写字母和空格。单词间有且仅有一个空格。
1 <= S.length <= 150。
 */
public class GoatLatin_824 {

    public static void main(String[] args){

        System.out.println(toGoatLatin("I speak Goat Latin"));
    }
    public static String toGoatLatin(String S) {

        String[] str = S.split(" ");
        String res = "";
        for(int i=0;i<str.length;i++){
            String s=str[i];
            char[] c = s.toCharArray();
            if(c[0]=='a'||c[0]=='e'||c[0]=='i'||c[0]=='o'||c[0]=='u'||c[0]=='A'||c[0]=='E'||c[0]=='I'||c[0]=='O'||c[0]=='U')
                s=s+"ma";
            else{
                char tmp=c[0];
                for(int j=1;j<c.length;j++){
                    c[j-1]=c[j];
                }
                c[c.length-1]=tmp;
                s=String.valueOf(c)+"ma";
            }
            for(int k=1;k<=i+1;k++)
                s=s+"a";
            str[i]=s;
        }
        for(int i=0;i<str.length-1;i++)
            res=res+str[i]+" ";
        return res+str[str.length-1];
    }
}
