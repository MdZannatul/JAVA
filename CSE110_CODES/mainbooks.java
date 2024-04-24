import java.util.Scanner;

public class mainbooks {
    public static void main(String[] args) {


        System.out.println("Enter Book shop data: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter book author name: ");
        String au = input.nextLine();

        System.out.println("Enter book title name: ");
        String ti = input.nextLine();

        System.out.println("Enter book price: ");
        int pr = input.nextInt();

        System.out.println("Enter book stock amount: ");
        int st = input.nextInt();

        books b1 = new books(au, ti, pr, st);   //class object and initializing using constructor



        System.out.println("Enter Book details to search:");
        //System.out.println("Enter book author name: ");
        String au1 = input.nextLine();

        System.out.println("Enter book title name: ");
        String ti1 = input.nextLine();

        b1.searchBooks(au1,ti1);


        System.out.println("Enter your required amount of book: ");
        int st1 = input.nextInt();

        b1.cost(st1);
    }
}
