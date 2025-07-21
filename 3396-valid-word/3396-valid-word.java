class Solution {
    public boolean isValid(String word) {
        boolean min = word.length() >= 3;
        boolean valid = true;
        boolean vowel = word.replaceAll("[aeiouAEIOU]", "").length() != word.length();
        boolean consonant = word.replaceAll("[^aeiouAEIOU1-9]", "").length() != word.length();
        for (int i : word.toCharArray()) {
            if (!((i >= '0' && i <= '9') || (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))) {
                valid = false;
            }
        }
        System.out.print(word.replaceAll("[^aeiouAEIOU]", ""));
        return min && valid && vowel && consonant;
    }
}