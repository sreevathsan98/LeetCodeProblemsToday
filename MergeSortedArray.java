
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.



class MergeSortedArray {
    public void reverse(int[] nums,int start,int end){
       while(start<end){
           int temp=nums[start];
           nums[start]=nums[end];
           nums[end]=temp;
           start++;
           end--;
       }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
}