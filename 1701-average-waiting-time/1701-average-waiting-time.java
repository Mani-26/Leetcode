class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time=0;
        long waitingTime=0;
        for(int[] customer:customers){
            int arrival=customer[0];
            int prep=customer[1];
            if(time<arrival){
                time=arrival;
            }
            time+=prep;
            waitingTime+=(time-arrival);
        }
        return (double)waitingTime/customers.length;
    }
}