class DDLinsertion{
    Node head;
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    
    public void prepend(int data){
            Node newNode=new Node(data);

            if (head==null){
            head=newNode;
            }
            else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            }
            }
            public void anypend(int pos, int data){
            Node newNode=new Node(data);

            if (head==null){
            head=newNode;
            }
            if (pos==1){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            }
            else {
            Node currNode=head;
            for(int i=1;i<pos-1;i++){
        currNode=currNode.next;
        }
        if (currNode==null){
        System.out.println("position out of bound");
        }
        else{
        newNode.next = currNode.next;
        currNode.next= newNode;
        newNode.prev= currNode;
        }
        }
        }

        public void append(int data){
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
        newNode.prev=currNode;
        }
        }

        int search(int data){
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
        public void showLL(){
        System.out.print("null->");
        if (head==null){
        System.out.println("Empty List");
        }
        Node currNode=head;
        while(currNode!=null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
        }
        System.out.println("null");
        }

    public static void main(String[] args) {
        DDLinsertion obj =new DDLinsertion();
        int a;
        obj.prepend(5);
        obj.prepend(6);
        obj.prepend(7);
        obj.prepend(8);
        obj.append(10);
        obj.append(11);
        obj.anypend(8,12);
        a=obj.search(5);
        if (a>0){
        System.out.println("ELement found at pos - "+a);
        }
        else{
        System.out.println("Element not found");
        }

        obj.showLL();
        }
}

