class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        if(n<3) return n;
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int count=0;
        for(int i:freq){
            while(i>2){
                i=(i%3)+(i/3);
            }
            count+=i;
        }
        return count;
    }
}