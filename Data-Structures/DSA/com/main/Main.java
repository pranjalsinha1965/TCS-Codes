package DSA.com.main;

// Import ONLY the module (folder)
import DSA.src.tree.*;

// Inherit BinaryTree in Main
public class Main extends BinaryTree {

    public static void main(String[] args) {

        // Object of the Main class (which inherits BinaryTree)
        Main tree = new Main();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.preorder();  // inherited method
    }
}
