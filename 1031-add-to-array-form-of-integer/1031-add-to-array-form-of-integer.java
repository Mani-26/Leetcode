class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<Integer>();
        int i = num.length - 1;
        int val = 0;
        while (i >= 0 || k > 0 || val != 0) {
            if (i >= 0)
                val += num[i--];
            if (k > 0)
                val += k%10;
            list.add(val % 10);
            val /= 10;
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}