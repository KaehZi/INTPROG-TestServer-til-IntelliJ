import java.util.Scanner;

public class TestAflevering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Update TestServer");
            System.out.println("2. Download files");
            System.out.println("3. Test and open in browser");
            System.out.println("4. Test exercise");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        TestServer.updateTestServer();
                        break;
                    case 2:
                        System.out.print("Enter exercise (e.g., CG1, CG3, CG5): ");
                        String exercise = scanner.nextLine();
                        TestServer.downloadCourseFiles(exercise);
                        break;
                    case 3:
                        System.out.print("Enter exercise to test and open in browser: ");
                        String exerciseToOpen = scanner.nextLine();
                        TestServer.testAndOpenInBrowser(exerciseToOpen);
                        break;
                    case 4:
                        System.out.print("Enter exercise to test: ");
                        String exerciseToTest = scanner.nextLine();
                        System.out.println(TestServer.test(exerciseToTest));
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
