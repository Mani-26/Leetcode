class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int oddCount =0;
        int result=0;
        for(int num : nums){
            if(num % 2 == 1){
                oddCount++;
            }
            if(hm.containsKey(oddCount - k)){
                result += hm.get(oddCount - k);
            }
            hm.put(oddCount, hm.getOrDefault(oddCount, 0)+1);
        }
        return result;
    }
}