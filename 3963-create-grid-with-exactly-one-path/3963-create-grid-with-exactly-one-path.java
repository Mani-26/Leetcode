class Solution {
    public String[] createGrid(int m, int n) {
        String []res=new String[m];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sb.append((i==0 || j==n-1)?'.':'#');
            }
            res[i]=sb.toString();
            sb.setLength(0);
        }
        return res;
    }
}