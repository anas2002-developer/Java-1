import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            sum+=i;
        }
        return sum;
    }
}
public class HackerrankInterface {
    public static void main(String[] args) {
        MyCalculator obj=new MyCalculator();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("I Implemented: AdvancedArithmetic");
        System.out.println(obj.divisor_sum(n));
    }
}
