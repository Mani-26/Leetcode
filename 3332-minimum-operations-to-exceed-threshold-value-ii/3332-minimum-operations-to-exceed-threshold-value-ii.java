class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add((long)i);
        }
        int count=0;
        while (pq.size()>1&&pq.peek()<k) {
            long val1=pq.poll();
            long val2=pq.poll();
            pq.add(val1*2+val2);
            count++;
        }
        return pq.peek() >= k ? count : 0; 
    }
}