import java.util.Scanner;

public class mainDriveTest {
    public static void main(String[] args) {
        DriveTest person = new DriveTest(20);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int pAge= input.nextInt();

        person.setAge(pAge);

        person.driveStatus();
    }
}
