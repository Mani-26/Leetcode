class Solution {
    public int countSegments(String s) {
        // return s.trim().split("\\s+").length;

        // String arr[]=s.split(" ");
        // int count=0;
        // for(String str:arr){
        //     if(str.length()>0) count++;
        // }
        // return count;

        int count=0;
        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(i)!=' '){
                count++;
            }else if(s.charAt(i)!=' ' && s.charAt(i-1)==' '){
                count++;
            }
        }
        return count;
    }
}