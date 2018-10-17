package Array.Easy;
/*
假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。

示例 1:
输入: flowerbed = [1,0,0,0,1], n = 1
输出: True

示例 2:
输入: flowerbed = [1,0,0,0,1], n = 2
输出: False

注意:
数组内已种好的花不会违反种植规则。
输入的数组长度范围为 [1, 20000]。
n 是非负整数，且不会超过输入数组的大小。
 */
public class CanPlaceFlowers_605 {

    public static void main(String[] args){

        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int sum = 0;
        if(flowerbed.length==1 && flowerbed[0]==0){
            if(n>1) return false;
            else return true;
        }
        else if(flowerbed.length==1 && flowerbed[0]==1){
            if(n==0) return true;
            else return false;
        }

        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            sum++;
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-1]=1;
            sum++;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                sum++;
            }
        }
        if(sum>=n)
            return true;
        else
            return false;
    }
}
