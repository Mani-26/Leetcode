class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int minCount=1,min=1,maxCount=1,max=1,n=nums.length;
        int x=nums[0],y=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                min++;
            }
            else{
                min=1;
            }
            if(nums[i-1]<nums[i]){
                max++;
            }
            else{
                max=1;
            }
            if(min>minCount){
                minCount = min;
            }
            if(max>maxCount){
                maxCount = max;
            }
            // System.out.println(min+" "+max+" "+minCount+" "+maxCount+" ");
        }
        return maxCount>minCount?maxCount:minCount;
    }
}