import java.lang.annotation.Retention;

public class AVL {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    // find height
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    // find BF
    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    // left rotation
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        // perform ratation
        y.left = x;
        x.right = T2;
        // update height
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        // return new root
        return y;
    }
// right rotate
    public static Node rightRotate(Node y) {
        Node x = y.left;
        if (x == null) {
            return y;
        }
        Node T2 = x.right;
        // perform ratation
        x.right = y;
        y.left = T2;
        // update height
        x.height = Math.max(height(y.left), height(y.right)) + 1;
        y.height = Math.max(height(x.left), height(x.right)) + 1;
        // return new root
        return x;
    }
    

   // insert
public static Node insert(Node root, int val) { // insert function return root
    if (root == null) {
        return new Node(val);

    }
    if (val < root.data) {
        root.left = insert(root.left, val);
    } else {
        root.right = insert(root.right, val);
    }
    
    // update root height
    root.height = 1 + Math.max(height(root.left), height(root.right));
    // Get root's balance factor
    int bf = getBalance(root);
    // Left Left case
    if (bf > 1 && val < root.left.data) {
        return rightRotate(root);
    }
    // right right case
    if (bf < -1 && val > root.right.data) {
        return leftRotate(root);
    }
    // left right case
    if (bf > 1 && val > root.left.data) {
        root.left = leftRotate(root.left);
        return rightRotate(root);
    }
    // right left case
    if (bf < -1 && val < root.right.data) {
        root.right = rightRotate(root.right);
        return leftRotate(root);
    }
    
    return root; // reterend if AVL is already balanced
}

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        root = insert(root, 40);
        root = insert(root, 20);
        root = insert(root, 10);
        root = insert(root, 25);
        root = insert(root, 30);
        root = insert(root, 22);
        root= insert(root, 50);
        /*
         * 30
         * / \
         * 20 40
         * / \ \
         * 10 25 50
         */
        preOrder(root);
    }
}