package DSA.com.main;
import DSA.src.linkedlist.*;
public class Main extends LinkedList{
    public static void main(String[] args)
    {
        LinkedList nums = new LinkedList();
        nums.add(5);
        nums.add(9);
        nums.add(6);
        nums.addFirst(7);
        nums.delete(9);
        nums.printValues();
    }
}
