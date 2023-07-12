//Using Linked List Collection Framework by using this can directly use functions of linked without
//creating functions from scratch.

import java.util.*;

public class LLcollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> LL=new LinkedList<String>();
        //add=addLast
        LL.addFirst("a");
        LL.addFirst("am");
        LL.addFirst("i");
        LL.addLast("hero");
        LL.addLast("..");
        LL.add("Haina?");
        System.out.println("size="+LL.size());
        System.out.println("LL: "+LL);
        System.out.println();

        for(int i=0;i<LL.size();i++){
            System.out.print(LL.get(i)+"->");
        }
        System.out.print("Null");

        //remove=removeFirst
        System.out.println();
        LL.removeFirst();
        LL.removeLast();
        System.out.println("LL: "+LL);
        LL.remove();
        System.out.println("LL: "+LL);
        LL.remove(2);               //remove(index)
    }
}
