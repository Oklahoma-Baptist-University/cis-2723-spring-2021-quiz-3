package edu.okbu.cis2723.sp2021;

public class Main {

    public static void main(String[] args) {
	    // Grading - 5 points for test code
        CourseGrade grade_001 = new CourseGrade("CIS", 2723, 3.0, 4.0f);
        System.out.println(grade_001);
        System.out.println("\tgrade points " + grade_001.getGradePoints());

        CourseGrade grade_002 = new CourseGrade("CIS", 2723, 0.0, 4.0f);
        System.out.println(grade_002);

        CourseGrade grade_003 = new CourseGrade("CIS", 2723, 2.0, 5.0f);
        System.out.println(grade_003);
    }
}
