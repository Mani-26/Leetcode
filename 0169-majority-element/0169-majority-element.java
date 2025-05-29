class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int freq=0;
        int res=nums[0];
        for(int i:mp.keySet()){
            if(mp.get(i)>freq){
                freq=mp.get(i);
                res=i;
            }
        }
        return res;
    }
}