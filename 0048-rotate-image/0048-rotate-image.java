class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int i=0,j=i+1;
        while(i<n){
            while(j<n){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                j++;
            }
            i++;
            j=i+1;
        }
        i=0;
        while(i<n){
            int k=n-1;
            j=0;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
            i++;
        }
    }
}