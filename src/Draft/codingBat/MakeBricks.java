package Draft.codingBat;

public class MakeBricks {
    public static void main(String[] args) {

        int small = 20; // 20
        int big = 4;    // 0
        int goal = 39;  // 19

        boolean isPossible = false;
        int brick = 0;
        int bigBricks = 0;
        int i = 0;
        int y = 0;
        if (goal < small) isPossible = true;
        else {
                while (i < big || y < small){
                    if (i < big) {
                        i++;
                        bigBricks += 5;
                    }
                    y++;
                    brick +=  bigBricks + 1;
                    if ( brick == goal){
                        isPossible = true;
                        break;
                    }
                }
        }

        System.out.println(isPossible);
    }
}
