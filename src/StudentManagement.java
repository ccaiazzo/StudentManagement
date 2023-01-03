import java.util.*;
public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students will be added to the database?");
        Student[] studentList = new Student[sc.nextInt()];

        Course course1 = new Course("BUS 101", 600);
        Course course2 = new Course("CIS 101", 400);
        Course course3 = new Course("JAVA 101", 300);
        Course[] listCourse = new Course[3];
        String name = "";
        int year = 0;
        Random rand = new Random();
        for(int i = 0; i < studentList.length; i++) {
            System.out.println("Please enter a name for student " + (i+1));
            studentList[i].setStudentName(sc.nextLine());
            System.out.println("What year is student " + (i+1) + "?");
            year = sc.nextInt();
            int randNum = rand.nextInt((9999));
            String idString = String.valueOf(year) + String.format("%04d", randNum);
            studentList[i].setStudentId(Integer.parseInt(idString));
            System.out.println("Which courses would you like to enroll in? Your choices: ");
        }
    }
}
