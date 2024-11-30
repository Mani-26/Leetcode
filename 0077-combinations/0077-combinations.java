class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        // List<Integer> li=new ArrayList<>();
        combine(1,n,k,new ArrayList<>(),list);
        return list;
    }
    public void combine(int j,int n,int k,List<Integer>li,List<List<Integer>> list){
        if(li.size()==k){
            list.add(new ArrayList<>(li));
            return;
        }
        for(int i=j;i<=n;i++){
            li.add(i);
            combine(i+1,n,k,li,list);
            li.remove(li.size()-1);
        }
    }
}