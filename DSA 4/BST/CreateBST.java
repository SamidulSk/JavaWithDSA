import java.util.*;

// create a BST
public class CreateBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) { // insert function return root
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // search O(H)
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Delete
    public static Node delete(Node root, int val) {
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else { // delete this root
            // case 1-> leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2:- single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3:- have both child
            Node Is = findInorderSuccessor(root.right);// because successor always present in right subtree
            root.data = Is.data; // replace the value
            root.right = delete(root, Is.data);
        }
        return root;
    }

    // InOrder Succesor
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) { // find left most child
            root = root.left;
        }
        return root;
    }

    // print In Range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // print root to leave all path
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        path.add(root.data);
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);  // remove current node from path
    }

    // print Path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
    }

    // Is Valid BST?:-- maximum of left subtree have to less then root
    // minumum of right subtree have to greter then root
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
// mirror a BST
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror= createMirror(root.left);
        Node rightMirror=createMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }

    public static void main(String args[]) {
        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println(search(root, 9));
        System.out.println("After delete:--");
        root = delete(root, 2);
        inOrder(root);
        System.out.println();
        System.out.println("Print in range");
        printInRange(root, 3, 7);
        System.out.println("\nall path from root to leaf");
        printRoot2Leaf(root, new ArrayList<>());
        System.out.println();
        System.out.println(isValidBST(root, null, null)); // you check by puting duplicate Node
    }
}