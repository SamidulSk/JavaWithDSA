import java.util.*;

public class Topview {
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

    static class Info {
        Node node;
        int HD; // horizontal distance

        public Info(Node node, int hd) {
            this.node = node;
            this.HD = hd;
        }
    }

    public static void topView(Node root) {
        // level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) { // level order traversal
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (!map.containsKey(curr.HD)) { // if not extist then add(first time)
                    map.put(curr.HD, curr.node); // add
                }
                if (curr.node.left != null) { // check for left child
                    q.add(new Info(curr.node.left, curr.HD - 1)); //
                    min = Math.min(min, curr.HD - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.HD + 1)); // check for right child
                    max = Math.max(max, curr.HD + 1);
                }
            }
        }
        // print top view
        for (int i = min; i <= max; i++) { // -1 to +2 for below tree
            System.out.print(map.get(i).data + " ");// print value of each unique key for map
        }
        System.out.println();

    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        topView(root);

    }
}
