import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the day of the week:");
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.err.println("The day of the week is Monday");
                    break;

                case 2:
                    System.err.println("The day of the week is Tuesday");
                    break;

                case 3:
                    System.err.println("The day of the week is Wednesday");
                    break;

                case 4:
                    System.err.println("The day of the week is Thursday");
                    break;

                case 5:
                    System.err.println("The day of the week is Friday");
                    break;

                case 6:
                    System.err.println("The day of the week is Saturday");
                    break;

                case 7:
                    System.err.println("The day of the week is Sunday");
                    break;

                default:
                    System.err.println("Invalid day of the week. Please enter a number between 1 and 7.");
                    break;
            }
        }
    }

}
