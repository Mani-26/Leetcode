class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int n:nums){
            if(!s.add(n)) return n;
        }
        return -1;
    }
}