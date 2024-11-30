class Solution {
    public boolean isPalindrome(int x) {
        int b=0;
        if(x%10==0 &&x!=0 || x<0)
            return false;
        else{
        while(x>b){
            b=b*10+x%10;
            x/=10;
        }
            return (x==b || x==b/10);
        }
    }
}