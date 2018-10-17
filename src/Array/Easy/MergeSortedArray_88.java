package Array.Easy;
/*
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:
初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

示例:
输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
输出: [1,2,2,3,5,6]
 */
public class MergeSortedArray_88 {

    public static void main(String[] args){

        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1,m,nums2,n);

        for(int i=0;i<nums1.length;i++)
            System.out.println(nums1[i]);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0) {
            for (int k = 0; k < n; k++) {
                nums1[k] = nums2[k];
                m++;
            }
        }
        else
            for(int i=0;i<n;i++){
                if(nums2[i]<nums1[0]){
                    for(int k=m;k>0;k--)
                        nums1[k]=nums1[k-1];
                    nums1[0]=nums2[i];
                    m++;
                }
                else
                    for(int j=m-1;j>=0;j--){
                        if(nums2[i]>=nums1[j]){
                            for(int k=m;k>j+1;k--)
                                nums1[k]=nums1[k-1];
                                nums1[j+1]=nums2[i];
                                m++;
                                break;
                        }
                    }
            }
    }
}
