class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str="";
        int len;
        int out=0;
        for(int i=0;i<s.length();i++){
            len=0;
            boolean arr[]=new boolean[256];
            for(int j=i;j<s.length();j++){
                if(arr[s.charAt(j)]==true){
                    break;
                }
                else{
                    len++;
                    arr[s.charAt(j)]=true;
                }
            }
            out=Math.max(out,len);
        }
        return out;
    }
}