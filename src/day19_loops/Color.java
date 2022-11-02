package day19_loops;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOfColors = 0;
        String colors = "";

        while(numOfColors < 3){

            System.out.println("Enter the next color");
            String inputColor = input.nextLine();

            if (!colors.contains(inputColor)){
                colors += " " + inputColor;
                numOfColors++;
            }

        }

        System.out.println(colors);
    }
}
