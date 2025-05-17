class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int i : nums) {
            if (i == 0)
                zero++;
            else if (i == 1)
                one++;
            else
                two++;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(i<zero){
                nums[i]=0;
            }else if(i<zero+one){
                nums[i]=1;
            }else{
                nums[i]=2;
            }
        }
    }
}