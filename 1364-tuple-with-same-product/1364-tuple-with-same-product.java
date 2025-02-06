class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int res=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int product=nums[i]*nums[j];
                count+=(mp.getOrDefault(product,0)*8);
                mp.put(product,mp.getOrDefault(product,0)+1);
            }
        }
        return count;
    }
}