class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> li=new ArrayList<>();
        for(int i=nums[0];i<nums[n-1];i++){
            if(!(binSearch(i,nums))){
                li.add(i);
            }
        }
        return li;
    }
    boolean binSearch(int val, int nums[]){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==val){
                return true;
            }else if(nums[mid]>val){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}