class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = 0;
        int missing = 0;
        int sum = 0;
        int max = 0;
        for(int num : nums){
            max = (max<num)? num : max;
        }
        int freq[] = new int[max+1];
        for(int num : nums){
            freq[num]++;
        }
        for(int i = 1; i < max+1; i++){
            if(freq[i]==0){
                missing = i;
            }
            if(freq[i] >1){
                dup = i;
            }
        }
        return new int[]{dup, (missing!=0)?missing:max+1};
    }
}