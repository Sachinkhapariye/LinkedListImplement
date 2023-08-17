import org.w3c.dom.Node;

public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){data = d;next = null;}
    }
    public  void insertBegining(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void inserEnd(int new_data){
        Node new_node = new Node(new_data);
        if (head == null){
            head = new_node;
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    public void inserAfter(Node prev_node,int new_data){
        if (prev_node == null){
            System.out.println("the pre node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void deletNode(int element){
        Node temp ;
        if (head.data == element){
            temp = head;
            head = temp.next;
        }

        Node curr = head;
        while (curr.next != null){
            if (curr.next.data == element){
                temp = curr.next;
                curr.next = curr.next.next;
                break;
            }else {
                curr = curr.next;
            }
        }



    }

    public int countSize(){
        Node temp = head;
        int count = 0;
        while ( temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean searchElement(int element){
        Node curr = head;
        while ( curr != null){
            if (curr.data == element){
                return true;
            }else {
                curr = curr.next;
            }
        }
        return false;
    }

    
//    public void printList(){
//        Node nodee = head;
//        while (nodee != null){
//            System.out.println(nodee.data + " ");
//            nodee = nodee.next;
//        }
//    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node fiev = new Node(5);

        linkedList.head.next = second;
        second.next = third;
        third.next = four;
        four.next = fiev;

        //linkedList.insertBegining(6);
        //linkedList.inserEnd(7);
        //linkedList.inserAfter(linkedList.head.next,8);
        //linkedList.deletNode(3);
        //System.out.println("The size of the liknedlist is = "+ linkedList.countSize());
//        if (linkedList.searchElement(6)){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }

        while (linkedList.head != null){
            System.out.println(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }


    }
}
