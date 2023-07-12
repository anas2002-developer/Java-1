import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        System.out.print("Enter salary=");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double tax = 0;
        System.out.print("Tax = ");
            if (salary <= 50000) {
                System.out.println(tax);
            } else if (salary <= 60000) {
                tax = (double)10/100 * (salary-50000);
                System.out.println(tax);
            } else if (salary <= 150000) {
                tax = (double)20/100 * (salary-60000);
                System.out.println(tax);
            } else {
                tax = (double)30/100 * (salary-150000);
                System.out.println(tax);
            }
        }
    }

