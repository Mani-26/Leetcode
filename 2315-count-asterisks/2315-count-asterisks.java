class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int res=0;
        for(char c:s.toCharArray()){
            if(c=='|')count++;
            if(c=='*' &&count%2==0) res++;
        }
        return res;
    }
}