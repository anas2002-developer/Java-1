import java.util.*;

//Palindrome Program

public class palindromeString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev="";
        int len=A.length();
        for(int i=len-1;i>=0;i--){
            rev+=A.charAt(i);
        }
        if (rev.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}