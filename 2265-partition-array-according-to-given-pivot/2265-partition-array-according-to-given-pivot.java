class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[]=new int[nums.length];
        List<Integer> lt=new ArrayList<>();
        List<Integer> gt=new ArrayList<>();
        int count=0;
        for(int i:nums){
            if(i<pivot){
                lt.add(i);
            }
            else if(i>pivot){
                gt.add(i);
            }
            else{
                count++;
            }
        }
        int index=0;
        for(int i:lt){
            res[index++]=i;
        }
        for(;count>0;){
            res[index++]=pivot;
            count--;
        }
        for(int i:gt){
            res[index++]=i;
        }
        return res;
    }
}