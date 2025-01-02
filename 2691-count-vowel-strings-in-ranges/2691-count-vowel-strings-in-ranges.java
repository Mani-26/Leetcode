class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int arr[]=new int[n];
        int prefix[]=new int[n];
        int m=queries.length;
        int res[]=new int[m];
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');hs.add('e');hs.add('i');hs.add('o');hs.add('u');
        for(int i=0;i<n;i++){
            int k=words[i].length()-1;
            // if((words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u')&&(words[i].charAt(k)=='a'||words[i].charAt(k)=='e'||words[i].charAt(k)=='i'||words[i].charAt(k)=='o'||words[i].charAt(k)=='u')){
            if(hs.contains(words[i].charAt(0))&&hs.contains(words[i].charAt(k))){
                arr[i]=1;
            }
        }
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int i=0;i<m;i++){
            if(queries[i][0]==0){
                res[i]=prefix[queries[i][1]];
            }
            // else if(queries[i][0]==queries[i][1]){
            //     res[i]=arr[queries[i][1]];
            // }
            else{
                res[i]=prefix[queries[i][1]]-prefix[queries[i][0]-1];
            }
            // res[i]=(queries[i][0]!=0)?arr[queries[i][1]-1]-arr[queries[i][0]]:arr[queries[i][1]];
        }
        // for(int i=0;i<m;i++){
        //     int count=0;
        //     for(int j=queries[i][0];j<=queries[i][1];j++){
        //         if(arr[j]){
        //             count++;
        //         }
        //     }
        //     res[i]=count;
        // }
        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(res));
        return res;
    }
}