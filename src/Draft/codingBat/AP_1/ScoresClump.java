package Draft.codingBat.AP_1;

import java.util.ArrayList;
import java.util.List;

public class ScoresClump {
    public static void main(String[] args) {
        int[] scores = {3, 3, 7, 7, 9};


        boolean isClump = false;
        int store = 0;
        for (int i = 1, j = 0; i < scores.length && j < scores.length; i++, j++) {
            if(scores[i] - scores[j] <= 2){
                i++;
                if (i < scores.length && scores[i] - scores[j] <= 2) isClump = true;
                else i--;
            }
        }

        System.out.println(isClump);
    }
}
