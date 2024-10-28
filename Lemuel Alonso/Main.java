class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student studentGrade1 = new Student("Alice", 3.8);
        Student studentGrade2 = new Student("Bob", 3.5);

        if (studentGrade1.getGpa() > studentGrade2.getGpa()) {
            System.out.println(studentGrade1.getName() + " has a higher GPA than " + studentGrade2.getName() + ".");
        } else {
            System.out.println(studentGrade2.getName() + " has a higher GPA than " + studentGrade1.getName() + ".");
        }
    }
}
