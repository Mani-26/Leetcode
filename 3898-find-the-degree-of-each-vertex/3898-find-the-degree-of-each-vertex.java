class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                arr[i]+=matrix[j][i];
            }
        }
        return arr;
    }
}