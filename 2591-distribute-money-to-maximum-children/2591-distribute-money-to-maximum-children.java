class Solution {
    public int distMoney(int money, int children) {
        if(money<children) return -1;
        money-=children;
        int quotient=money/7;
        int remainder=money%7;
        if(quotient==children&&remainder==0) return children;
        if(quotient==children-1&&remainder==3) return children-2;
        return quotient>children-1?children-1:quotient;
    }
}