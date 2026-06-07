class Solution {
    public String reversePrefix(String s, int k) {
        // StringBuilder sb=new StringBuilder(s.substring(0,k));
        // sb.reverse();
        // sb.append(s.substring(k,s.length()));
        // return sb.toString();
        char[] ch=s.toCharArray();
        int r=k-1;
        int l=0;
        while(l<r){
            char c=ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;
        }
        return new String(ch);
    }
}