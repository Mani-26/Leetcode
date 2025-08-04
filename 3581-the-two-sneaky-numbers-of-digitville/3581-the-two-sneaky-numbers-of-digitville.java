class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int index=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                arr[index++]=nums[i];
                i++;
            }
        }
        // Arrays.sort(arr);
        return arr;
    }
}