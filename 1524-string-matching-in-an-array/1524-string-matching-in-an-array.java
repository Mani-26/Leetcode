class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if((words[j].indexOf(words[i])>=0)&&(!li.contains(words[i]))){
                    li.add(words[i]);
                }
            }
        }
        return li;
    }
}