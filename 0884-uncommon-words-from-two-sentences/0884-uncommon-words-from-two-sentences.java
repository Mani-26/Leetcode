class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
        String words1[]=s1.split(" ");
        String words2[]=s2.split(" ");
        for(String word:words1){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        for(String word:words2){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        int count=0;
        HashSet<String> hs=new HashSet<>();
        for(String word:words1){
            if(hm.get(word)==1){
                hs.add(word);
            }
        }
        for(String word:words2){
            if(hm.get(word)==1){
                hs.add(word);
            }
        }
        return hs.toArray(new String[0]);
    }
}