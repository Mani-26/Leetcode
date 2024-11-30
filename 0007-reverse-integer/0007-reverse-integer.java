// class Solution {
//     public int reverse(int x) {
//         int res = 0;
//         while (x != 0) {
//             int rem=x%10;
//             x/=10;
//             if(res>Integer.MAX_VALUE/10||res<Integer.MIN_VALUE/10)
//                 return 0;
//             res=res*10+rem;
//             System.out.println(res);
//         }
//         return res;
//     }
// }
class Solution{
    public int reverse(int x){
        long res=0L;
        while(x!=0){
            res=res*10+x%10;
            x/=10;
        }
        return (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)? 0:(int)res;
    }
}