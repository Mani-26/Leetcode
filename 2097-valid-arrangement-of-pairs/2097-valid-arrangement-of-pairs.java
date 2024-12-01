class Solution {
    public int[][] validArrangement(int[][] pairs) {
        Map<Integer, Deque<Integer>> adj = new HashMap<>();
        Map<Integer, Integer> degree = new HashMap<>();
        
        // Build the graph and track degrees
        for (int[] pair : pairs) {
            int start = pair[0], end = pair[1];
            adj.computeIfAbsent(start, k -> new ArrayDeque<>()).add(end);
            degree.put(start, degree.getOrDefault(start, 0) + 1);
            degree.put(end, degree.getOrDefault(end, 0) - 1);
        }
        
        // Find starting node for Eulerian Path
        int start = pairs[0][0]; // Default start
        for (int node : degree.keySet()) {
            if (degree.get(node) == 1) { // Node with out-degree > in-degree
                start = node;
                break;
            }
        }
        
        // Perform Hierholzer's algorithm
        List<int[]> result = new ArrayList<>();
        dfs(start, adj, result);
        
        // Convert list to array in reversed order
        Collections.reverse(result);
        return result.toArray(new int[result.size()][]);
    }
    
    private void dfs(int node, Map<Integer, Deque<Integer>> adj, List<int[]> result) {
        Deque<Integer> neighbors = adj.get(node);
        while (neighbors != null && !neighbors.isEmpty()) {
            int next = neighbors.pollFirst();
            dfs(next, adj, result);
            result.add(new int[]{node, next});
        }
    }
}
