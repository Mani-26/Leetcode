class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sum=0;
        int pSum=0;
        int res=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            pSum+=i;
            sum+=arr[i];
            if(pSum==sum) res++;
        }
        return res;
    }
}