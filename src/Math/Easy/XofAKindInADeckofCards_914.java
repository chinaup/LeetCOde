package Math.Easy;
/*
给定一副牌，每张牌上都写着一个整数。
此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
每组都有 X 张牌。
组内所有的牌上都写着相同的整数。
仅当你可选的 X >= 2 时返回 true。

示例 1：
输入：[1,2,3,4,4,3,2,1]
输出：true
解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]

示例 2：
输入：[1,1,1,2,2,2,3,3]
输出：false
解释：没有满足要求的分组。

示例 3：
输入：[1]
输出：false
解释：没有满足要求的分组。

示例 4：
输入：[1,1]
输出：true
解释：可行的分组是 [1,1]

示例 5：
输入：[1,1,2,2,2,2]
输出：true
解释：可行的分组是 [1,1]，[2,2]，[2,2]

提示：
1 <= deck.length <= 10000
0 <= deck[i] < 10000
 */
import java.util.Arrays;

public class XofAKindInADeckofCards_914 {

    public static void main(String[] args){

        int[] deck = {1,1,1,2,2,2,3,3};
        System.out.println(hasGroupsSizeX(deck));
    }
    public static boolean hasGroupsSizeX(int[] deck) {

        Arrays.sort(deck);
        if(deck.length==1) return false;
        for(int i=2;i<=deck.length;i++){
            if(deck.length%i!=0)
                continue;
            int flag=1;
            for(int j=0;j<deck.length;j=j+i){
                for(int k=j;k<j+i-1;k++){
                    if(deck[k]!=deck[k+1])
                        flag=0;
                }
            }
            if(flag==1) return true;
        }
        return false;
    }
}































