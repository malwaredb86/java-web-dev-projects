import java.util.HashMap;
import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){

        Student student = new Student ("Mal Durham", 69420, 1, 4.0);
    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public void setFirstName (String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName () {
            return firstName;
        }
        public void setLastName (String lastName) {
            this.lastName = lastName;
        }
        public String getLastName () {
            return lastName;
        }
        public void setSubject (String subject) {
            this.subject = subject;
        }
        public String getSubject () {
            return subject;
        }
        public void setYearsTeaching (int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }
        public int getYearsTeaching () {
            return yearsTeaching;
        }
    }

    public class Course {
        private String courseName;

        private Teacher professorName;
        private ArrayList<Student> enrolledStudents;
    }
}
