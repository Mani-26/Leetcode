class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> li = new LinkedList<>();
        for (int i : nums1)
            li.add(i);
        for (int i : nums2)
            li.add(i);
        Collections.sort(li);
        int n = li.size();
        if (n % 2 == 0)
            return (li.get(n / 2) + li.get(n / 2 - 1)) / 2.0;
        else
            return li.get(n / 2);
    }
}