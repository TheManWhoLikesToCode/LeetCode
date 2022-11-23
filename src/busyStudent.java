public class busyStudent {

    public int method(int[] startTime, int[] endTime, int queryTime) {

        int upbBound = 0, lowBound = 0, counter = 0;

        for(int i: startTime){
            upbBound = endTime[i];
            lowBound = startTime[i];

            if(queryTime >= upbBound && queryTime <= lowBound){
                counter++;
            }
        }
        return counter;
    }
}
