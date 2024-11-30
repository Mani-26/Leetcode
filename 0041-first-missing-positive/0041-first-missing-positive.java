class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i:nums){
            if(i>0&&i<=n){
                arr[i]++;
            }
        }
        for(int j=1;j<=n;j++){
            if(arr[j]==0){
                return j;
            }
        }
        return n+1;
    }
}