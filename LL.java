public class LL {
    Node head;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        Node node = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;

    }

    public void printList() {
        Node node = head;
        if (node == null) {
            System.out.println("List is empty");
            return;
        }
        while (node.next != null) {
            System.out.print(node.val + " -> ");
            node=node.next;
        }
    }

    public static LL merge(LL l1, LL l2) {
        Node h1 = l1.head;
        Node h2 = l2.head;
        LL ans = new LL();
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                ans.addLast(h1.val);
                h1 = h1.next;
            } else {
                ans.addLast(h2.val);
                h2 = h2.next;
            }
        }
        while (h1 != null) {
            ans.addLast(h1.val);
            h1 = h1.next;
        }
        while (h2 != null) {
            ans.addLast(h2.val);
            h2 = h2.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        LL l1 = new LL();
        LL l2 = new LL();
        LL ans = new LL();

        l1.addLast(1);
        l1.addLast(3);
        l1.addLast(4);
        l2.addLast(1);
        l2.addLast(3);
        l2.addLast(4);
        ans=merge(l1, l2);
        ans.printList();
    }

}
