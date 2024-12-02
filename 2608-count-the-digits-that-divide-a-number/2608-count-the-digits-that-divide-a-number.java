class Solution {
    public int countDigits(int num) {
        int val=num;
        int count=0;
        while(val>0){
            if(num%(val%10)==0)count++;
            val/=10;
        }
        return count;
    }
}