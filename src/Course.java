public class Course {
    private String courseName;
    private int courseTuition;

    public Course(String courseName, int courseTuition) {
        this.courseName = courseName;
        this.courseTuition = courseTuition;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseTuition() {
        return courseTuition;
    }

    public void setCourseTuition(int courseTuition) {
        this.courseTuition = courseTuition;
    }
}
