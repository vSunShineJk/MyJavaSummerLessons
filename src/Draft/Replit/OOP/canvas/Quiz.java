package Draft.Replit.OOP.canvas;

public class Quiz {
    String topic;
    int total_number_of_questions;
    double total_points;

    public Quiz(String topic, int total_number_of_questions, double total_points){
        this.topic = topic;
        this.total_number_of_questions = total_number_of_questions;
        this.total_points = total_points;
    }

    public void takeQuiz(){
        System.out.println("Taking the " + topic + " quiz");
    }

    @Override
    public String toString() {
        return "Quiz | "+topic+" quiz with "+total_number_of_questions+" questions for total of "+total_points+" total points";
    }
}
