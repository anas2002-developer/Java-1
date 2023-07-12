//Linked List Deletion
class LLdeletion{
    Node head;      //Address of Head
    private int size;
    LLdeletion(){
        this.size=0;
    }
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
    public void predelete(){       //for deleting node at start
        if (head==null){
            System.out.println("Empty Linked List");
        }
        else {
            head=head.next;
        }
    }
    public void sufdelete(){         //for deleting node at end
        if (head==null){
            System.out.println("Empty Linked List");
        }
        if (head.next==null){
            head=null;
        }
        else {
            Node seclastNode=head;
            Node lastNode=head.next;
            while(lastNode.next!=null) {
                lastNode=lastNode.next;
                seclastNode=seclastNode.next;
            }
            seclastNode.next=null;
        }
    }

    public void showLL(){           //for showing Linked List
        if (head==null){
            System.out.println("Empty List");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
            size++;
        }
        System.out.println("NULL");
    }
    public void getsize(){
        System.out.println(size);
    }
    public static void main(String[] args) {
        LLdeletion obj=new LLdeletion();
        obj.prepend("aman");
        obj.prepend("is");
        obj.prepend("name");
        obj.prepend("My");
        obj.append("bhaiya");
        obj.append("DIT");

        obj.predelete();
        obj.sufdelete();
        obj.showLL();
        obj.getsize();
    }
}
