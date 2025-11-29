import java.util.ArrayList;
import java.util.Scanner;

public class resultSrevice {

    private ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent(){
        System.out.print("Enter roll no : ");
        int roll = sc.nextInt();
        sc.nextLine();

        if(students.contains(roll)){
            System.out.println("Roll number already exists");
            return;
        }
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        students.add(new Student(roll,name));
        System.out.println("Student added successfully");
    }

    public void entermarks(){

        System.out.print("enter roll no : ");
        int roll = sc.nextInt();

        Student s = findstudent(roll);

        if(s == null){
            System.out.print("Student not found");
            return;
        }

        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        s.setMarks(marks);
        System.out.println("Marks updated successfully");
    }

    public void viewstudentresult(){
        System.out.print("Enter the role number : ");
        int roll = sc.nextInt();

        Student s = findstudent(roll);

        if(s == null){
            System.out.println("Student unavailable");
            return;
        }

        s.displayResult();
    }

    public void diplaystudentsresult(){
        if(students.isEmpty()){
            System.out.println("No students available");
            return;
        }
        for(Student s : students){
            s.displayResult();
        }
    }

    public void passPercentage() {
        if (students.isEmpty()) {
            System.out.println("❌ No Students Available!");
            return;
        }

        int passCount = 0;

        for (Student s : students) {
            if (s.getResult().equals("Pass")) {
                passCount++;
            }
        }

        double percentage = (passCount * 100.0) / students.size();
        System.out.println("✅ Pass Percentage: " + percentage + "%");
    }

    public void showTopper() {
        if (students.isEmpty()) {
            System.out.println("No Students Available!");
            return;
        }

        Student topper = students.get(0);

        for (Student s : students) {
            if (s.getTotal() > topper.getTotal()) {
                topper = s;
            }
        }
        System.out.println("🏆 CLASS TOPPER:");
        topper.displayResult();
    }

    public void deleteStudent() {
        System.out.print("Enter Roll No to Delete: ");
        int roll = sc.nextInt();

        Student s = findstudent(roll);

        if (s == null) {
            System.out.println(" Student Not Found!");
            return;
        }

        students.remove(s);
        System.out.println("Student Deleted Successfully!");
    }

    private Student findstudent(int roll) {
        for (Student s : students) {
            if (s.getRollno() == roll) {
                return s;
            }
        }
        return null;
    }
}




/*
✔ Add student
✔ Store multiple students
✔ Enter marks
✔ Auto calculate result
✔ Individual result view
✔ All students result
✔ Class topper
✔ Pass percentage
✔ Delete student */