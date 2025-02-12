class Solution {
    public String removeOccurrences(String s, String part) {
        int n=s.length();
        int p=part.length();
        if(p>n) return s;
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            sb.delete(sb.indexOf(part),sb.indexOf(part)+p);
        }
        return sb.toString();
    }
}