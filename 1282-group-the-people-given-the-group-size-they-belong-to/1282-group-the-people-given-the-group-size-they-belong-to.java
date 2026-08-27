class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> li=new ArrayList<>();
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<groupSizes.length;i++){
            int group=groupSizes[i];
            if(hs.contains(group)){
                continue;
            }
            hs.add(group);
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<groupSizes.length;j++){
                if(groupSizes[j]==group){
                    list.add(j);
                    if(list.size()==group){
                        li.add(list);
                        list=new ArrayList<>();
                    }
                }
            }
        }
        return li;
    }
}