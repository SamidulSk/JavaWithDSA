import java.util.LinkedList;
import java.util.Queue;

// create a binary tree :->> we use doubly linked list  --(preOrder sequence)-  node->left->right
// 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 *** O(n) **
public class BinaryTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {    // take elements from array one by one and create tree
            index++; // index is now 0 means first element
            if (nodes[index] == -1) { // if there is no element in array
                return null;
            }
            Node newNode = new Node(nodes[index]);   //root
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // PreOrder Traversal
        // root-> left->right
        public static void preOrder(Node root) { // O(n)
            if (root == null) {
                // System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data + " ");

            preOrder(root.left);
            preOrder(root.right);

        }

        // inOrder Traversal
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // PostOrder Treaversal
        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); // for nextline
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preOrder(root);
        // System.out.println();
        // tree.inOrder(root);
        // System.out.println();
        // tree.postOrder(root);
        // System.out.println();
        tree.levelOrder(root);
    }
}