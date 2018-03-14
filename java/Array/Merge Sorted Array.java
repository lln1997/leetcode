class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n>0){
            int j = m-1,len=m+n-1,i=n-1;
            while(i>=0&&j>=0){
                if(nums2[i]>=nums1[j]){
                    nums1[len--]=nums2[i--];
                }else{
                    nums1[len--]=nums1[j--];
                }
            }
            //nums2还有余的话要继续添加，nums1余的话已经在nums1中就不用移动了
            while(i >= 0) {
                nums1[len--]=nums2[i--];
            }
        }
    }
}