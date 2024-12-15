class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                i++;
            } else {
                if (i < len - 1 && nums[i + 1] != 1) {
                    n--;
                    nums[i]=1;
                    i++;
                }
            }
            // System.out.println(n);
        }
        if ((len > 2 && nums[len - 1] == 0 && nums[len - 2] == 0)||(len==1&&nums[0]==0)){
            n--;
        }
            return n <= 0;
    }
}