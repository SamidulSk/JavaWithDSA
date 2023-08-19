import java.util.ArrayList;

// convert BST to balanced BST
public class BST4 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node creteBST(ArrayList<Integer>inorder, int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=creteBST(inorder, start, mid-1);
        root.right=creteBST(inorder, mid+1, end);
        return root;
    }

    public static Node balancedBST(Node root) {
        // 1-> find inOrder of given BST
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        // 2-> sorted inOrder -> balanced BST
        root=creteBST(inorder, 0, inorder.size()-1);
        return root;
    }

    public static void main(String args[]){
          /* given BST
   *            8
   *          /   \
   *         6      10 
   *        /         \
   *       5           11
   *      /             \
   *     3               12  
   *  
   */
  Node root=new Node(8);
  root.left=new Node(6);
  root.left.left=new Node(5);
  root.left.left.left=new Node(3);

  root.right=new Node(10);
  root.right.right=new Node(11);
  root.right.right.right=new Node(12);
  /*  Expected BST
   *         /*
   *             8
   *           /   \
   *         5      10
   *        / \        \
   *       3   6        11 
   */
   
  root=balancedBST(root);
  preOrder(root);
  
    }
}