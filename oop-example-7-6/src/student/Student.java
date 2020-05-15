package student;

public class Student {
    private String firstName = "Emily";
    private String lastName = "Kinney";
    private String group = "3-A";
    private double averageMark;
    public int scholarship;

    public void getScholarship(double averageMark){
        if (averageMark == 5) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        System.out.println(scholarship);
    }
}
