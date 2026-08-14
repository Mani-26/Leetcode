class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char chR=s.charAt(right);
            hm.put(chR, hm.getOrDefault(chR, 0) + 1);
            while (hm.get(chR) > 2) {
                char chL=s.charAt(left);
                hm.put(chL, hm.getOrDefault(chL, 0) - 1);
                if (hm.get(chL) == 0) {
                    hm.remove(chL);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);  
        }
        return maxLength;
    }
}