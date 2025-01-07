class Solution {
    public List<String> stringMatching(String[] words) {
        String word = String.join(" ", words);
        List<String> li = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(word.indexOf(words[i]) != word.lastIndexOf(words[i])){
                li.add(words[i]);
            }
        }
        return li;
    }
}