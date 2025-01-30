class Solution {
    static int parent[];
    static int res[]=new int[2];
    public int find(int k) {
        if (parent[k] != k) {
            parent[k] = find(parent[k]); 
        }
        return parent[k];
    }
    public void union(int u,int v){
        int x=find(u);
        int y=find(v);
        if(x==y){
            res[0]=u;
            res[1]=v;
        }
        parent[x]=y;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length+1;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int edge[]:edges) {
            union(edge[0],edge[1]);
        }
        return res;
    }
}