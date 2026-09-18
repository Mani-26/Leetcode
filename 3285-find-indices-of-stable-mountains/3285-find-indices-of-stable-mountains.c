/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* stableMountains(int* height, int n, int threshold, int* returnSize) {
    int* res=malloc(n*sizeof(int));
    int idx=0;
    for(int i=1;i<n;i++){
        if(height[i-1]>threshold){
            res[idx++]=i;
        }
    } 
    *returnSize=idx;
    return res;
}