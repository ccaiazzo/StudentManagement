import java.util.*;
import java.lang.Math;
public class Student {
    private int studentId;
    private String studentName;
    private int balance = 0;
    private Course[] courseList;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getBalance() {
        return balance;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    public void payTuition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much would you like to pay?");
        int payment = sc.nextInt();

        if (payment <= this.balance) {
            this.balance = this.balance - payment;
            System.out.println("Thank you for paying your balance. The remaining amount is " + this.balance + " dollars.");
        }
        else {
            int tempNumber = this.balance - payment;
            int refund = Math.abs(tempNumber);
            System.out.println("Thank you for paying off your balance. You have been refunded the extra " + refund + " dollars you paid.");
        }

    }
}
