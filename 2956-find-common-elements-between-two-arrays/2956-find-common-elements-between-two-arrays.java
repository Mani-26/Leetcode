class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm1=new HashMap<>();
        Map<Integer, Integer> hm2=new HashMap<>();
        int ans1=0;
        int ans2=0;
        for(int num : nums1){
            hm1.put(num, hm1.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            hm2.put(num, hm2.getOrDefault(num,0)+1);
        }
        for (Integer key : hm2.keySet()) {
            ans1+=hm1.getOrDefault(key,0);
        }
        for (Integer key : hm1.keySet()) {
            ans2+=hm2.getOrDefault(key,0);
        }
        return new int[]{ans1,ans2};
    }
}