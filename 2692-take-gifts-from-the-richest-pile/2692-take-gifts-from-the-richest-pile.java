class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res = 0L;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a < b ? 1 : -1);
        for (int i : gifts) {
            pq.add(i);
        }
        for (int i = 0; i < k; i++) {
            int sq = (int) Math.sqrt(pq.poll());
            pq.add(sq);
        }
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            res += pq.poll();
        }
        return res;
    }
}