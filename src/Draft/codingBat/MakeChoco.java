package Draft.codingBat;

public class MakeChoco {
    public static void main(String[] args) {
        int small = 3, big = 1, goal = 9;

        int numOfBig = goal/5, numOfSmall = goal%5, res = -1;
        System.out.println("numBig "+numOfBig +", numSmall "+numOfSmall);

        if (numOfBig > big){
            int smallToBig = small/5;
            if (smallToBig + big >= numOfBig){
                res = (smallToBig*5 + numOfSmall);
            }
        } else if (numOfBig <= big && numOfBig <= small){
            res = numOfSmall;
        } else res = -1;
        System.out.println(res);
    }
}
