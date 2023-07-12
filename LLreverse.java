//Linked List Insertion
class LLreverse{
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

    public void reverse(){
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
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
        LLreverse obj=new LLreverse();
        obj.prepend("aman");
        obj.prepend("is");
        obj.prepend("name");
        obj.prepend("My");
        obj.append("bhaiya");
        obj.append("DIT");
        obj.reverse();
        obj.showLL();

    }
}
