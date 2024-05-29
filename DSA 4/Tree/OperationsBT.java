// find height of a tree

import java.util.ArrayList;

public class OperationsBT {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int count(Node root) { // count the number of node in tree
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // Diameter of a tree:>> no of nodes in the longest path between 2 leaves
    public static int diameter(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiameter = diameter(root.right);
        int rightHeight = height(root.right);// selfdiameter =left height+right height+1;
        int selfDiameter = leftHeight + rightHeight + 1; // diameter which pass through root node
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter)); // ** Final diameter is maximum of left
                                                                              // diameter and right diameter and
        // selfdiameter

    }

    // Approach 2 for find diameter >>>O(n)
    static class Info { // make a info class which have both Info
        int diameter;
        int height;

        public Info(int diameter, int height) { // function returns Info class
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),
                leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(diameter, height);
    }

    // print kth level elements
    public static void kLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getpath(root.left, n, path);
        boolean foundRight = getpath(root.right, n, path);
        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    // first common ancester (Baap kon hay?)
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);

        // last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node-> i-1 th
        Node lca = path1.get(i - 1); // unequal ka age owala node is same
        return lca;

    }

    // approch 2 O(n) O(1)
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        // leftLca=val rightLca=null
        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    // to find distance of a node from lca
    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    // minimum distance beteween two node
    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    // find kth parent of a node
    public static int kAncestor(Node root, int n, int k) {
        if(root==null){
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);
        if (leftDist == -1 && rightDist == -1) { // may ancestor hu hi nahi
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String args[]) {
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
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("height = " + height(root));
        System.out.println(count(root));
        System.out.println(sumOfNodes(root));
        System.out.println("diameter is " + diameter(root));
        System.out.println(diameter2(root).diameter);
        System.out.println(diameter2(root).height);
        System.out.println("3rd level element are :- ");
        int k = 3;
        kLevel(root, 1, k);

        int n1 = 4, n2 = 6;
        System.out.println("\nancestor is " + lca(root, n1, n2).data);
        System.out.println("lowest common ancestor " + lca2(root, n1, n2).data);
        System.out.println("Minumum distance between tow node " + minDist(root, n1, n2));

        int n = 5;
        int kthparent = 2;
        System.out.println(kAncestor(root, n, kthparent));
    }
}