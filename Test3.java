public class Test3 {
    
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l1=head;
        ListNode n1=findCurr(l1,left);
        ListNode n2=findCurr(l1,right);
        if(n1==null || n2==null || n1==n2){
            return head;
        }
        ListNode prev=findPrev(l1,left);
        ListNode next=n2.next;
        n2.next=null;
        ListNode temp=reverse(l1);
        prev.next=temp;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=next;
        return head;
    }
    public static ListNode findCurr(ListNode head,int n){
        ListNode curr=head;
        if(n==1){
            return head;
        }
        while(n!=1 && curr.next!=null){
            curr=curr.next;
            n--;
        }
        if(n>1){
            return null;
        }
        return curr;
    }
    public static ListNode findPrev(ListNode head,int n){
        ListNode curr=head;
        ListNode prev=null;
        if(n==1){
            return null;
        }
        while(n!=1 && curr.next!=null){
            prev=curr;
            curr=curr.next;
            n--;
        }
        if(n>1){
            return null;
        }
        return prev;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static ListNode createLinkedList() {
        // Creating nodes for the linked list
        ListNode node5 = new ListNode(5);            // Last node
        ListNode node4 = new ListNode(4, node5);     // Node 4 points to node 5
        ListNode node3 = new ListNode(3, node4);     // Node 3 points to node 4
        ListNode node2 = new ListNode(2, node3);     // Node 2 points to node 3
        ListNode node1 = new ListNode(1, node2);     // First node points to node 2

        return node1;  // Head of the linked list
    }
    public static void main(String[] args) {
        ListNode head=createLinkedList();
        ListNode ans=reverseBetween(head,2,4);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}