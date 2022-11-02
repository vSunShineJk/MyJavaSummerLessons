package day32_arrayList;

import day30_practice_wrapper.IntroArrayList;

import java.util.ArrayList;

public class PracticeFlow {
    /*
    Practice flow

    Create an ArrayLIst of String
    add these elements
    add Hat
    add shoes
    add Jacket in middle of hat and shoes
    add towel in the beginning
    add CAr between Towel and Hat

    Print the ArrayList after each action to see how the change is made
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Hat");
        System.out.println(words);
        words.add("Shoes");
        System.out.println(words);
        words.add(1,"Jacket");
        System.out.println(words);
        words.add(0,"Towel");
        System.out.println(words);
        words.add(1,"Car");
        System.out.println(words);
        System.out.println("==========================================");
    /*
    Practice flow

    Create an ArrayList of Strings
    add these elements:
        Iron man, Spider-Man, Thor, Captain America, Hawker
        remove thor by Index
        remove iran man by element
        remove first index
        Print the arraylist after each action to see how the change is made
     */

        ArrayList<String> avengers = new ArrayList<>();

        avengers.add("Iron man");
        avengers.add("Spider man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawker");

        System.out.println(avengers);
        int indexOfTHor = avengers.indexOf("Thor");
        System.out.println(indexOfTHor);

        avengers.remove(indexOfTHor); // remove(2) -> but more dynamic
        System.out.println(avengers);

        avengers.remove("Iron man");
        System.out.println(avengers);

        avengers.remove(0);
        System.out.println(avengers);
        System.out.println("==============================================");

        // Removing in Integer Arraylist

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);

        // nums.remove(300); the 300 is an int here, so it is trying tio remove index 300
        nums.remove((Integer) 300); // 300 is being cast to Integer, so it will remove the element
        System.out.println(nums);
    }
}
