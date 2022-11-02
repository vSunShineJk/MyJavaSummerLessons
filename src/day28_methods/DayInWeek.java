package day28_methods;

public class DayInWeek {
    public static void main(String[] args) {
        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));

        switch (dayInWeek(7)){
            case "mon":
                System.out.println("Have full day of java");
                break;
            case "tue":
            case "thur":
                System.out.println("half java, half soft skills");
                break;
            case "wed":
                System.out.println("office hours");
                break;
            case "sat":
            case "sun":
                System.out.println("off");
        }
    }

    // 1-mon.. 7-sun

    public static String dayInWeek(int day){
        String[] days = {"mon", "tue", "wed", "thur", "fri", "sat", "sun"};
        return days[day - 1]; // convert the number to index
    }
}
