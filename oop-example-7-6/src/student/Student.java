package student;

public class Student {
    private String firstName = "Emily";
    private String lastName = "Kinney";
    private String group = "3-A";
    private double averageMark;
    private int scholarship;

    public void getScholarship(double averageMark){
        if (averageMark == 5) {
            setScholarship(100);
        } else {
            setScholarship(80);
        }
        System.out.println(getScholarship());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
