//Linked List Insertion
class LLinsertion{
    Node head;      //Address of Head
    class Node {
        String data;
        Node next;      //Address of next node

        Node(String data) {
            this.data = data;
            this.next = null;       //initial address of every single new node
        }
    }
    public void prepend(String data){       //for inserting node at start
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void anypend(int pos, String data){       //for inserting node at start
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
        }
        if (pos==1){
            newNode.next=head;
            head=newNode;
        }
        else {
            Node currNode=head;
            for(int i=1;i<pos-1;i++){
                currNode=currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next= newNode;
        }
    }

    public void append(String data){         //for inserting node at end
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
        }
        else {
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
    }

    public int search(String data){
        Node currNode=head;
        int pos=1;
        while(currNode!=null){
            if (currNode.data==data){
                return (pos);
            }
            currNode=currNode.next;
            pos++;
        }
        return 0;

    }
    public void showLL(){           //for showing Linked List
        if (head==null){
            System.out.println("Empty List");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LLinsertion obj=new LLinsertion();
        int a;
        obj.prepend("aman");
        obj.prepend("is");
        obj.prepend("name");
        obj.prepend("My");
        obj.append("bhaiya");
        obj.append("DIT");
        obj.anypend(7,"NEW");
        a=obj.search("NEW");
        if (a>0){
            System.out.println("ELement found at pos - "+a);
        }
        else{
            System.out.println("Element not found");
        }

        obj.showLL();
    }
}
