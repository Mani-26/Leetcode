class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.offer(entry);
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll().getKey();
        }
        return arr;
    }
}