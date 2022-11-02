package day42_abstruction.persone;

public final class Tester extends Employee {
    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Running Test cases");
        System.out.println("Finding locators");
    }

    @Override
    public void sleep(int hours) {
        System.out.println("Testers sleeps for " + hours + " while the automation cade runs");
    }
}
