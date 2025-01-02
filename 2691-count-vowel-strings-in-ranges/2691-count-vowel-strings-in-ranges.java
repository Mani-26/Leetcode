class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int m=queries.length;
        int arr[]=new int[n];
        int prefix[]=new int[n];
        int res[]=new int[m];
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');hs.add('e');hs.add('i');hs.add('o');hs.add('u');
        for(int i=0;i<n;i++){
            int k=words[i].length()-1;
            if(hs.contains(words[i].charAt(0))&&hs.contains(words[i].charAt(k))){
                arr[i]=1;
            }
        }
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int i=0;i<m;i++){
            int st=queries[i][0];
            int end=queries[i][1];
            if(st==0){
                res[i]=prefix[end];
            }
            else{
                res[i]=prefix[end]-prefix[st-1];
            }
        }
        return res;
    }
}