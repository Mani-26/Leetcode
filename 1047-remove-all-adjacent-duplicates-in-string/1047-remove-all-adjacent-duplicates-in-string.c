char* removeDuplicates(char* s) {
    int top = -1;
    int n = strlen(s);
    for (int i = 0; i < n; i++) {
        if (top >= 0 && s[i] == s[top]) {
            top--;
        } else {
            s[++top] = s[i];
        }
    }
    s[++top] = '\0';
    return s;
}