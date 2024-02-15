package Stacks;
import java.util.ArrayList;

public class Stack_queue1 {

    // stacks using arraylist
    static class Stack{
    static ArrayList<Integer> list=new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
 }
    // stacks using arraylist


    //stack using linked list
    // static class Node {
    //     int data;
    //     Node next;
    //     public Node (int data){
    //         this.data=data;
    //         next=null;
    //     }
    // }
    // static class Stack{
    //     public static Node head;
    //     public static boolean isEmpty(){
    //         return head==null;
    //     }
    //     public static void push(int data){
    //     Node newNode=new Node(data);
    //         if(isEmpty()){
    //             head=newNode;
    //             return;
    //         }
    //         newNode.next=head;
    //         head=newNode;
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top=head.data;
    //         head=head.next;
    //         return top;
    //     }
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    //stack using linked list
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        // Stack<Integer> stack=new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // Queue<Integer> queue=new LinkedList<>();
        // queue.add(3);
        // queue.add(7);
        // queue.add(1);
        // queue.add(2);
        // queue.add(5);
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
    }
}
