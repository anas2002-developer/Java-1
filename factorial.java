import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");
        int i=sc.nextInt();
        int factorial=1;

        while(i>0){
            factorial*=i;
            i--;
        }

        System.out.println("Factorial is "+factorial);

    }
}
