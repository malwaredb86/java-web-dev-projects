public class Student {

        private static int nextStudentID = 1;
        private String name;
        private int numberOfCredits;
        private double gpa;
        private int studentID;

        public Student(String name, int studentID, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentID = studentID;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public Student(String name, int studentID) {
                this(name, studentID, 0, 0.0);
        }

        public Student (String name) {
                this(name, nextStudentID);
                nextStudentID++;
        }

        public String studentInfo() {
                return (this.name + " has a GPA of: " + this.gpa);
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getID() {
                return studentID;
        }

        public void setID(int studentID) {
                this.studentID = studentID;
        }

        public int getCredits() {
                return numberOfCredits;
        }

        private void setCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public double getGPA() {
                return gpa;
        }

        public void setGPA(double gpa) {
                this.gpa = gpa;
        }


        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
