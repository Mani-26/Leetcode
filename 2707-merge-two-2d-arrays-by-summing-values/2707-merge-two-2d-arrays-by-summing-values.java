class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> mp=new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            mp.put(nums1[i][0],mp.getOrDefault(nums1[i][0],0)+nums1[i][1]);
        }
        for(int i=0;i<m;i++){
            mp.put(nums2[i][0],mp.getOrDefault(nums2[i][0],0)+nums2[i][1]);
        }
        int res[][]=new int[mp.size()][2];
        int i=0;
        for(Integer key:mp.keySet()){
            res[i][0]=(int)key;
            res[i][1]=(int)mp.get(key);
            i++;
        }
        Arrays.sort(res, Comparator.comparingInt(row -> row[0]));
        return res;
    }
}