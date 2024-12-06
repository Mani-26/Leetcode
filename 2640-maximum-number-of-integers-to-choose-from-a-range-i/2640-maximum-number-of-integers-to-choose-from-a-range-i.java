class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        int count=0;
        Set<Integer> hs=new HashSet<>();
        for(int i:banned){
            hs.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)&&sum+i<=maxSum){
                sum+=i;
                count++;
            }
        }
        return count;
    }
}