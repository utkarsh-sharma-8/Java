public class DuplicateRemoveInLinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }
    public void duplicate(){
        Node node=head;

        while(node.next!=null){
            if(node.data==node.next.data){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next; 
        }
        currNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DuplicateRemoveInLinkedList list =new DuplicateRemoveInLinkedList();
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        list.duplicate();
        list.printList();
    }
}
