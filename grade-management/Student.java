class Student {
    int roll;
    String name;
    int marks;
    char grade;

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    Student(int roll, String name, int marks, char grade) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }
}
