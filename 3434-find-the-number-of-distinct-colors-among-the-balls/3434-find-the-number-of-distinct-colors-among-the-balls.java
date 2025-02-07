class Solution {

    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (count.containsKey(queries[i][0])) {
                int temp = count.get(queries[i][0]);
                mp.put(temp, mp.get(temp) - 1);
                if (mp.get(temp) == 0) {
                    mp.remove(temp);
                }
            }
            count.put(queries[i][0], queries[i][1]);
            mp.put(queries[i][1], mp.getOrDefault(queries[i][1], 0) + 1);
            res[i] = mp.size();
        }
        return res;
    }
}