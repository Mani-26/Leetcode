class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        for(int j=n-2;j>=0;j--){
            suffix[j]=suffix[j+1]*nums[j];
        }
        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));
        nums[0]=suffix[1];
        nums[n-1]=prefix[n-2];
        for(int i=1;i<n-1;i++)
            nums[i]=prefix[i-1]*suffix[i+1];
        return nums;
    }
}