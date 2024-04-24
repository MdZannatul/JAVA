import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;
    public Date(int M,int D, int Y) {
        month = M;
        day = D;
        year = Y;
    }

    public void setMonth(int myMonth) {
        month = myMonth;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int myDay) {
        day = myDay;
    }

    public int getDay() {
        return month;
    }

    public void setYear(int myYear) {
        year = myYear;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.printf( day+"/"+month+"/"+year);
    }
}

class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date myDate = new Date(10, 1, 2000);

        System.out.println("Enter the Date: ");
        int myDay = input.nextInt();
        myDate.setDay(myDay);

        System.out.println("Enter The Month: ");
        int myMonth = input.nextInt();
        myDate.setMonth(myMonth);

        System.out.println("Enter the Year: ");
        int myYear = input.nextInt();
        myDate.setYear(myYear);
        myDate.displayDate();
    }
}