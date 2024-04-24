import java.util.Scanner;

public class mainMovieShow {
    public static void main(String[] args) {
        MovieShow mshow = new MovieShow(2, true, 77);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a= input.nextInt();
        mshow.setAge(a);

        System.out.println("Are you With your parent? ");
        boolean b = input.nextBoolean();
        mshow.setWithParent(b);

        System.out.println("How much money do you have? ");
        int m = input.nextInt();
        mshow.setMoney(m);

        mshow.permittedShow();
    }
}
