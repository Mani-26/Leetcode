class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        ArrayList<Integer> st=new ArrayList<>();
        for(int i:nums2){
            while(!st.isEmpty()&&st.get(st.size()-1)<i){
                hm.put(st.remove(st.size()-1),i);
            }
            st.add(i);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}