class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0],temp=nums[0],n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                temp+=nums[i];
            }
            else{
                sum=sum<temp?temp:sum;
                temp=nums[i];
            }
        }
        return sum<temp?temp:sum;
    }
}