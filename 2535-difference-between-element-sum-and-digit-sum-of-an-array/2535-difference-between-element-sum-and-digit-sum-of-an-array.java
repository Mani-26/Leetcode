class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        for(int i:nums){
            digitSum+=sumOfDigits(i);
            sum+=i;
        }
        return sum-digitSum;
    }
    private int sumOfDigits(int n){
        if(n<10) return n;
        int res=0;
        while(n>0){
            res+=n%10;
            n/=10;
        }
        return res;
    }
}