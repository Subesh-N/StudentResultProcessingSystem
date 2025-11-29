import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        resultSrevice service = new resultSrevice();

        int choice;

        do {
            System.out.println("\n===== STUDENT RESULT PROCESSING SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Enter Marks");
            System.out.println("3. View Student Result");
            System.out.println("4. View All Results");
            System.out.println("5. Show Class Topper");
            System.out.println("6. Show Pass Percentage");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.addStudent();
                    break;

                case 2:
                    service.entermarks();
                    break;

                case 3:
                    service.viewstudentresult();
                    break;

                case 4:
                    service.diplaystudentsresult();
                    break;

                case 5:
                    service.showTopper();
                    break;

                case 6:
                    service.passPercentage();
                    break;

                case 7:
                    service.deleteStudent();
                    break;

                case 8:
                    System.out.println("✅ Exiting System... Thank You!");
                    break;

                default:
                    System.out.println("❌ Invalid Choice! Try Again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
