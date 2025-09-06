class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "BridgeLabz"; // class variable

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 10000);
        Course c2 = new Course("Python", 2, 8000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("CodeAcademy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
