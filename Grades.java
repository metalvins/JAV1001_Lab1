import java.math.BigDecimal;
import java.util.Scanner;

public class Grades {
    public static void main(String args[]) {
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("\n");
        System.out.print("Enter your grade: ");
        double grade = in.nextDouble();
        System.out.print("\n");

        if(grade < 0.0 || grade > 100.0) {
            System.out.print("You entered an invalid grade.\n\n");
            return;
        }
        int letter = (int) grade/10;

        System.out.printf("Hello %s. Your letter grade is ", name);

        switch(letter) {
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                BigDecimal forAtoB = BigDecimal.valueOf(grade).subtract(BigDecimal.valueOf(80.0));
                System.out.print("\n");
                System.out.println("Started from the bottom, now we here!");
                System.out.println("Lose more than " + forAtoB + " points to drop to B");
                break;
            case 7:
                System.out.println("B");
                BigDecimal forBtoA = BigDecimal.valueOf(80.0).subtract(BigDecimal.valueOf(grade));
                BigDecimal forBtoC = BigDecimal.valueOf(grade).subtract(BigDecimal.valueOf(70.0));
                System.out.print("\n");
                System.out.println("Lose more than " + forBtoC + " points to drop to C");
                System.out.println("Or gain " + forBtoA + " points to rise to A");
                break;
            case 6:
                System.out.println("C");
                BigDecimal forCtoB = BigDecimal.valueOf(70.0).subtract(BigDecimal.valueOf(grade));
                BigDecimal forCtoD = BigDecimal.valueOf(grade).subtract(BigDecimal.valueOf(60.0));
                System.out.print("\n");
                System.out.println("Lose more than " + forCtoD + " points to drop to D");
                System.out.println("Or gain " + forCtoB + " points to rise to B");
                break;
            case 5:
                System.out.println("D");
                BigDecimal forDtoC = BigDecimal.valueOf(60.0).subtract(BigDecimal.valueOf(grade));
                BigDecimal forDtoF = BigDecimal.valueOf(grade).subtract(BigDecimal.valueOf(50.0));
                System.out.print("\n");
                System.out.println("Lose more than " + forDtoF + " points to drop to F");
                System.out.println("Or gain " + forDtoC + " points to rise to C");
                break;
            default:
                System.out.println("F");
                BigDecimal forFtoD = BigDecimal.valueOf(50.0).subtract(BigDecimal.valueOf(grade));
                System.out.print("\n");
                System.out.println("Push it to the limit!");
                System.out.println("Or gain " + forFtoD + " points to rise to D");
        }
        System.out.print("\n");
    }
}
