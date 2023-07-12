import java.util.*;

abstract class number{
    abstract void table();
}
class tabn extends number{
    @Override
    void table(){
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");
        int N=sc.nextInt();

        for(int i=0;i<=10;i++){
            arr.add(N*i);
        }

        for(int j=0;j<arr.size();j++){
            if (arr.get(j)%2==0)
                System.out.println(arr.get(j)+"-EVEN    Updated:"+(arr.get(j)+5));
            else
                System.out.println(arr.get(j)+"-ODD    Updated:"+(arr.get(j)-5));
        }
    }

}
public class practical {
    public static void main(String[] args) {
        tabn t=new tabn();
        t.table();


}}
