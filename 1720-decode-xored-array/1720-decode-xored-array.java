class Solution {
    public int[] decode(int[] encoded, int f) {
        int n=encoded.length;
        int res[] = new int[n+1];
        res[0]=f;
        for(int i=0;i<n;i++){
            res[i+1]=encoded[i]^res[i];
        }
        return res;
    }
}