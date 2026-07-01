class Solution {
    boolean vowels(char ch){
        return ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U';
    }
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char ch[]=s.toCharArray();
        while(l<r){
            while(l<r&&!vowels(ch[l]))l++;
            while(l<r&&!vowels(ch[r]))r--;
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;r--;
        }
        return new String(ch);
    }
}