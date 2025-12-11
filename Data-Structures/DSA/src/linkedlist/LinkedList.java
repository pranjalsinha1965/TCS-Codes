package DSA.src.linkedlist;
public class LinkedList {
    nNode head = null;
    public void add(int data)
    {
        nNode newNode = new nNode(data);
        nNode current = new nNode(data);
        if(head == null)
        head = newNode;
        else {
            while(current.next != null)
            current = current.next;
            current.next = newNode;
        }
    }
    public void printValues()
    {
        nNode current = head;
        while(current != null)
        {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void addFirst(int data)
    {
        nNode newNode = new nNode(data);
        newNode.next = head;
        head = newNode;
    }  
    public void delete(int data)
    {
        nNode current = head;
        while(current.next != null && current.next.data != data)
        {
            current = current.next;
        }
        if(current.next != null)
        {
            current.next = current.next.next;
        }
    }
}
