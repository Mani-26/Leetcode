class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> mp1=new HashMap<>();
        Map<Character,Character> mp2=new HashMap<>();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0,j=0;i<s.length();i++,j++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(!mp1.containsKey(ch1)){
                mp1.put(ch1,ch2);
            }
            sb1.append(mp1.get(ch1));
            ch1=t.charAt(j);
            ch2=s.charAt(j);
            if(!mp2.containsKey(ch1)){
                mp2.put(ch1,ch2);
            }
            sb2.append(mp2.get(ch1));
        }
        return sb1.toString().equals(t)&&sb2.toString().equals(s);
        // Set<Character> sSet=new HashSet<>();
        // Set<Character> tSet=new HashSet<>();
        // for(int i=0;i<s.length();i++) sSet.add(s.charAt(i));
        // for(int i=0;i<t.length();i++) tSet.add(t.charAt(i));
        // return sSet.size()==tSet.size();
    }
}