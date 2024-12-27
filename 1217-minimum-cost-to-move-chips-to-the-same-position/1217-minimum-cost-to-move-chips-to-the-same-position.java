class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0;
        int even =0;
        for(int i:position){
            if((i&1)==1) odd++;
            else even++;
        }
        return odd<even? odd:even;
    }
}