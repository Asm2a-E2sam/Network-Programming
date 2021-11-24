package section1_NP;

public class Course {
    private String courseName;
    private String[] students = new String[50];
    private int numOfStudents = 0;

    public Course(String courseName){
        this.courseName = courseName;
        for (int i = 0; i < students.length; i++) {
            students[i] = "";
        }
    }

    public void addStudent(String student) {
        students[numOfStudents] = student;
        numOfStudents++;

    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                students[i] = "";
                System.out.println("Student removed");
                break;
            }
            System.out.println("Student not found");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }
}
class StudentMain {
    public static void main(String[] args) {
        Course c1 = new Course("Network Programming");

        c1.addStudent("Asmaa");
        c1.addStudent("Mona");
        c1.addStudent("Adam");

        System.out.println("Number of students in course 0f "
                +c1.getCourseName()+" : "+ c1.getNumOfStudents());

        String[] students = c1.getStudents();
        for (int i = 0; i < c1.getNumOfStudents(); i++)
            System.out.println("Student " + (i+1) + " "+students[i] );

    }
}