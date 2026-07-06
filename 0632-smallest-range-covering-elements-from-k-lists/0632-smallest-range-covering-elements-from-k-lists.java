class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int cMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            int value = nums.get(i).get(0);
            pq.offer(new int[]{value,i,0});
            cMax=Math.max(value,cMax);
        }
        int start=0;
        int end=Integer.MAX_VALUE;
        while(pq.size()==nums.size()){
            int minNode[]=pq.poll();
            int cMin=minNode[0];
            int list=minNode[1];
            int index=minNode[2];
            if(cMax-cMin < end-start){
                start=cMin;
                end=cMax;
            }
            int nextIndex=index+1;
            if(nextIndex==nums.get(list).size()){
                break;
            }
            int nextValue=nums.get(list).get(nextIndex);
            pq.offer(new int[]{nextValue,list,nextIndex});
            cMax=Math.max(cMax,nextValue);
        }
        return new int[]{start,end};
    }
}