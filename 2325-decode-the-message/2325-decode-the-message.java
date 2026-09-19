class Solution {
    public String decodeMessage(String key, String message) {
        LinkedHashSet<Character> hs=new LinkedHashSet<>();
        for(char ch:key.toCharArray()){
            if(ch==' ') continue;
            hs.add(ch);
        }
        ArrayList<Character> li=new ArrayList<>(hs);
        StringBuilder sb=new StringBuilder();
        for(char ch:message.toCharArray()){
            if(ch==' ') sb.append(' ');
            else{
                sb.append((char)(97+li.indexOf(ch)));
            }
        }
        return sb.toString();
    }
}