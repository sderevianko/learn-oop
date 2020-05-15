package aspirant;

import student.Student;

public class Aspirant extends Student {
    private int numberOfScientificArticles = 7;
    public void getScholarship(double averageMark){
        if (averageMark == 5) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        System.out.println(scholarship);
    }
}
