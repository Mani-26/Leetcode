/*
class Solution {
    public boolean canChange(String start, String target) {
        int i = 0;
        int j = 0;
        int l1 = start.length();
        int l2 = target.length();
        char q[] = start.toCharArray();
        char z[] = target.toCharArray();
        while (i < l1 && j < l2) {
            // System.out.println(i + " " + j);
            // System.out.println(q);
            // System.out.println(z);
            if((q[i]=='L'&&z[j]=='R')||(q[i]=='R'&&z[j]=='L')||(q[i]=='_'&&z[j]=='R')||(q[i]=='L'&&z[j]=='_')){
                return false;
            }
            else if (q[i] == z[j]) {
                i++;
                j++;
            } 
            else if (z[j] == 'L') {
                int index = i + 1;
                while (index < l1 && q[index] == '_') {
                    index++;
                    // System.out.print(" " + index);
                }
                if (index<l1&&q[index] == 'R'){
                    return false;
                }
                else if(index<l1) {
                    q[index] = '_';
                    q[i] = 'L';
                    i++;
                    j++;
                }
                else{
                    return false;
                }
            }
            else{
                int index = j + 1;
                while (index < l2 && z[index] == '_') {
                    index++;
                    // System.out.print(" " + index);
                }
                if (index<l2&&z[index] == 'L'){
                    return false;
                }
                else if(index<l2) {
                    q[index] = '_';
                    q[i] = 'L';
                    i++;
                    j++;
                }
                else{
                    return false;
                }
            } 
            // else {
            //     int index = i + 1;
            //     while (index < l1 && q[index] == '_') {
            //         index++;
            //         // System.out.print(" " + index);
            //     }
            //     if (index<l1&&q[index] == 'L'){
            //         return false;
            //     }
            //     else if(index<l1&&q[index]=='R'){
            //         index++;
            //         while (index < l1 && q[index] == 'R') {
            //             index++;
            //             // System.out.print(" " + index);
            //         }
            //         if (index<l1&&q[index] == 'L'){
            //             return false;
            //         }
            //         else if(index<l1) {
            //             q[index] = 'R';
            //             q[i] = '_';
            //             i++;
            //             j++;
            //         }
            //         else{break;}
            //     }
            //     else if(index<l1) {
            //         q[index] = '_';
            //         q[i] = 'R';
            //         i++;
            //         j++;
            //     }
            //     else{break;}
            // }
        }
        return true;
    }
}
*/
class Solution {
    public boolean canChange(String start, String target) {
        int i = 0;
        int j = 0;
        int l1 = start.length();
        int l2 = target.length();
        char q[] = start.toCharArray();
        char z[] = target.toCharArray();
        while (i < l1 && j < l2) {
            // if ((q[i] == 'L' && z[j] == 'R') || (q[i] == 'R' && z[j] == 'L') || (q[i] ==
            // '_' && z[j] == 'R')
            // || (q[i] == 'L' && z[j] == '_')) {
            // return false;
            // }
            while (i < l1 && q[i] == '_') {
                i++;
            }
            while (j < l2 && z[j] == '_') {
                j++;
            }
            if (i == l1 && j == l2)
                return true;
            if (i == l1 || j == l2 || q[i] != z[j])
                return false;
            if (q[i] == 'L' && i < j) {
                return false;
            }
            if (q[i] == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }
        while (i < l1 && q[i] == '_') {
            i++;
        }
        while (j < l2 && z[j] == '_') {
            j++;
        }
        return i == l1 && j == l2;
    }
}