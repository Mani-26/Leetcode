class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hs=new HashSet<>();
        for(int friend : friends)
            hs.add(friend);
        int res[]=new int[friends.length];
        int idx=0;
        for(int i : order){
            if(hs.contains(i)) res[idx++]=i;
        }
        return res;
    }
}