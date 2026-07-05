class Solution {
    public int kSimilarity(String s1, String s2) {
        if(s1.equals(s2)) return 0;
        Queue<String> q=new LinkedList<>();
        Set<String> visited=new HashSet<>();

        q.offer(s1);
        visited.add(s1);
        
        int swaps=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                size--;
            
                String curr=q.poll();

                if(curr.equals(s2)) return swaps;

                int i=0;
                char arr[]=curr.toCharArray();
                while(arr[i]==s2.charAt(i)) i++;

                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==s2.charAt(i) && arr[j]!=s2.charAt(j)){
                        swap(arr,i,j);
                        String next=new String(arr);
                        if(visited.add(next)){
                            q.offer(next);
                        }
                        swap(arr,i,j);
                    }
                }
            }
            swaps++;
        }
        return -1;
    }
    private void swap(char[] arr, int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}