char findTheDifference(char* s, char* t) {
    int n=strlen(s);
    int m=strlen(t);
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=s[i];
    }
    for(int i=0;i<m;i++){
        sum-=t[i];
    }
    return abs(sum);
}