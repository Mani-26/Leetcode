class Solution {
    public int[] plusOne(int[] digits) {
        int carry =1;
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            int temp=digits[i]+carry;
            digits[i]=temp%10;
            if(temp/10==1){
                carry=1;
            }else{
                carry=0;
                break;
            }
        }
        
        if(carry==1){
            int[] arr=new int[n+1];
            arr[0]=1;
            for(int i=1;i<=n;i++){
                arr[i]=digits[i-1];
            }
            return arr;
        }
        return digits;
    }
}