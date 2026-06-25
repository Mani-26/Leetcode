class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int max=Integer.MIN_VALUE;
        // int idx=-1;
        // while(k!=0){
        //     max=Integer.MIN_VALUE;
        //     for(int i=0;i<nums.length;i++){
        //         if(max<nums[i]){
        //             idx=i;
        //             max=nums[i];
        //         }
        //     }
        //     nums[idx]=-100000;
        //     k--;
        // }
        // return max;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : nums) {
            pq.offer(x);

            if (pq.size() > k)
                pq.poll();
        }

        return pq.peek();
    }
}