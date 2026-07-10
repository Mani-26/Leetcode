class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int s2Index = 0;
        int s2Count = 0;
        Map<Integer, int[]> map = new HashMap<>();
        int s1Count = 0;
        while (s1Count < n1) {
            for (char ch : s1.toCharArray()) {//acb
                if (ch == s2.charAt(s2Index)) {
                    s2Index++;
                    if (s2Index == s2.length()) {
                        s2Count++;
                        s2Index = 0;
                    }
                }
            }
            s1Count++;
            if (map.containsKey(s2Index)) {
                int[] previous = map.get(s2Index);
                int prevS1Count = previous[0];
                int prevS2Count = previous[1];
                int cycleLength = s1Count - prevS1Count;
                int cycleGain = s2Count - prevS2Count;
                int remaining = n1 - s1Count;
                int cycles = remaining / cycleLength;
                s1Count += cycles * cycleLength;
                s2Count += cycles * cycleGain;
            } else {
                map.put(s2Index, new int[]{s1Count, s2Count});
            }
        }
        return s2Count / n2;
    }
}