package edu.okbu.cis2723.sp2021;

// Grading - 5 points for class definition
public class CourseGrade {
    // Grading - 5 points for all instance variables
    private String department;
    private int courseNumber;
    private double courseHours;
    private float courseGrade;

    // Grading - 5 points for constructor
    public CourseGrade(String dept, int number, double hours, float grade) {
        this.department = dept;
        this.courseNumber = number;
        this.courseHours = hours;
        this.courseGrade = grade;

        if (!validGrade()) {
            System.out.println("Grade = " + grade + " must be between 0.0 and 4.0");
        }
        if (!validHours()) {
            System.out.println("Hours = " + hours + " must be between 1.0 and 4.0");
        }
    }

    // Grading - 5 points for valid grade and hours check
    private boolean validGrade() {
        return this.courseGrade <= 4.0 && this.courseGrade >= 0.0;
    }

    private boolean validHours() {
        return this.courseHours <= 4.0 && this.courseHours >= 1.0;
    }

    // Grading - 5 points for getGradePoints method
    public double getGradePoints() { return this.courseGrade * this.courseHours; }

    // Accessors
    // Grading - 5 points for all accessors
    public String getDepartment() { return this.department; }
    public int getCourseNumber() { return this.courseNumber; }
    public double getCourseHours() { return this.courseHours; }
    public float getCourseGrade() { return this.courseGrade; }

    // Mutators
    // Grading - 5 points for all mutators
    public void setDepartment(String dept) { this.department = dept; }
    public void setCourseNumber(int num) { this.courseNumber = num; }
    public void setCourseHours(double hours) { this.courseHours = hours; }
    public void setCourseGrade(float grade) { this.courseGrade = grade; }

    // 5 points for toString() method
    public String toString() {
        return this.department + "-" + this.courseNumber + "\n" +
                "\t" + "hours: " + this.courseHours + "\n" +
                "\t" + "grade: " + this.courseGrade;
    }

    // 5 points for equals() method
    public boolean equals(CourseGrade grade) {
        return this.department.equals(grade.getDepartment()) &&
                this.courseNumber == grade.getCourseNumber();
    }

}
