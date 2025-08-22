class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        byte freq[]=new byte[26];
        
        byte vMax=0;
        byte cMax=0;

        for(byte i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(byte i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20){
                if(freq[i]>vMax){
                    vMax=freq[i];
                }
            }else{
                if(freq[i]>cMax){
                    cMax=freq[i];
                }
            }
        }
        return cMax+vMax;        
    }
}