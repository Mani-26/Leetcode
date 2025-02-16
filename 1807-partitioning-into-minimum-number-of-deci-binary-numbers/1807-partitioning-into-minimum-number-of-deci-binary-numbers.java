class Solution {
    public int minPartitions(String n) {
        char max=n.charAt(0);
        for(char ch:n.toCharArray()){
            if(ch>max){
                max=ch;
            }
        }
        return max-'0';
    }
}