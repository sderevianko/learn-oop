package aspirant;

import student.Student;

public class Aspirant extends Student {
    private int numberOfScientificArticles = 7;

    public void getScholarship(double averageMark){
        if (averageMark == 5) {
            setScholarship(200);
        } else {
            setScholarship(180);
        }
        System.out.println(getScholarship());
    }

    public int getNumberOfScientificArticles() {
        return numberOfScientificArticles;
    }

    public void setNumberOfScientificArticles(int numberOfScientificArticles) {
        this.numberOfScientificArticles = numberOfScientificArticles;
    }
}
