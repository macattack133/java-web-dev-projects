public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        public void setStudentId(int atudentId) {
                this.studentId = studentId;
        }
        public void setName(String name) {
                this.name = name;
        }
        public void setGpa(double gpa) {
                this.gpa = gpa;
        }
        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        public int getStudentId() {
                return studentId;
        }
        public String getName() {
                return name;
        }
        public int getNumberOfCredits() {
                return numberOfCredits;
        }
        public double getGpa() {
                return gpa;
        }

}

