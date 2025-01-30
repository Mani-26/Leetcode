class Solution {
    public String removeStars(String s) {
        char[] c = s.toCharArray();
        int index=0;
        for(char ch: c){
            if(ch=='*'){
                index--;
            }
            else{
                c[index]=ch;
                index++;
            }
        }
        return new String(c, 0, index);
    }
}