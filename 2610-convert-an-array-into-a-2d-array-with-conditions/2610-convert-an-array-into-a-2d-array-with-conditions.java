class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        int []freq=new int[201];
        int max=0;
        for(int num:nums){
            freq[num]++;
            max=Math.max(max,freq[num]);
        }
        for(int i=0;i<max;i++){
            li.add(new ArrayList<>());
        }
        for(int i=0;i<max;i++){
            List<Integer> temp=li.get(i);
            for(int j=0;j<201;j++){
                if(freq[j]>0){
                    temp.add(j);
                    freq[j]--;
                }
            }
        }
        return li;
    }
}