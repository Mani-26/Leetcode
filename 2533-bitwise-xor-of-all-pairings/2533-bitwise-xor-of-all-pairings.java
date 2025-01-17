class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        if(nums1.length%2==0&&nums2.length%2==0)
         return 0;
         else if(nums1.length%2==0&&nums2.length%2!=0){
            return helper(nums1);
         }
         else if(nums1.length%2!=0&&nums2.length%2==0){
            return helper(nums2);
         }
         else{
            int a=helper(nums1);
            int b=helper(nums2);
            return a^b;
         }
    }
    int helper(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
}