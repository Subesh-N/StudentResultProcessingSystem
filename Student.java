public class Student {
    private int rollno;
    private String name;
    private char grade;
    private String result;
    private int[] marks = new int[5];
    private int total;
    private int avg;

    public Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }

    public void setMarks(int[] marks){
        this.marks = marks;
        calculatemarks();
    }

    public void calculatemarks(){

        int total = 0;
        boolean pass = true;

        for (int mark : marks){
            if(mark < 35){
                pass = false;
            }
            total += mark;
        }

        avg = total / 5;

        if(total > 450) grade = 'A';
        else if(total > 350) grade = 'B';
        else if (total > 300) grade = 'C';
        else grade = 'D';

        result = pass ? "Pass" : "Fail";
    }

    public char getGrade() {
        return grade;
    }

    public String getResult() {
        return result;
    }

    public int getTotal() {
        return total;
    }

    public int getAvg() {
        return avg;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll No : " + rollno);
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Grade   : " + grade);
        System.out.println("Result  : " + result);
        System.out.println("----------------------");
    }
}


