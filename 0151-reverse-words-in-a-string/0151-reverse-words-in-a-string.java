class Solution {
    public String reverseWords(String s) {
        // s=s.trim();
        String arr[]=s.split("\s+");
        int len=arr.length;
        StringBuilder sb=new StringBuilder();
        for(int i=len-1;i>=0;i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}