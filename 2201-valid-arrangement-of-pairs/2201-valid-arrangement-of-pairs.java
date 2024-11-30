class Solution {
    public int[][] validArrangement(int[][] pairs) {
        Map<Integer, Deque<Integer>> adj = new HashMap<>();
        Map<Integer, Integer> degIn = new HashMap<>();
        Map<Integer, Integer> degOut = new HashMap<>();
        for (int[] pair : pairs) {
            int start = pair[0], end = pair[1];
            adj.computeIfAbsent(start, k -> new ArrayDeque<>()).add(end);
            degOut.put(start, degOut.getOrDefault(start, 0) + 1);
            degIn.put(end, degIn.getOrDefault(end, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        int start = -1;
        for (int node : degOut.keySet()) {
            if (degOut.get(node) == degIn.getOrDefault(node, 0) + 1) {
                start = node;
                break;
            }
        }
        if (start == -1) {
            start = pairs[0][0];
        }
        dfs(start, adj, res);//dfs
        Collections.reverse(res);
        int[][] arr = new int[res.size() - 1][2];
        for (int i = 1; i < res.size(); i++) {
            arr[i - 1] = new int[] {res.get(i - 1),res.get(i)};
        }
        return arr;
    }
    public void dfs(int node,Map<Integer, Deque<Integer>> adjMatrix,List<Integer> res) {
        Deque<Integer> neighbors = adjMatrix.get(node);
        while (neighbors != null && !neighbors.isEmpty()) {
            int nextNode = neighbors.pollFirst();
            dfs(nextNode, adjMatrix, res);
        }
        res.add(node);
    }
}