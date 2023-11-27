import java.util.Scanner;

public class Month{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");

        float years = scanner.nextFloat();

        int MONTHS_IN_YEAR = 12;
        int DAYS_IN_YEAR = 365;

        float months = years * MONTHS_IN_YEAR;
        float days = years * DAYS_IN_YEAR;

        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}
