//create a BST from a sorted array
public class BalancedBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node creteBST(int arr[], int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=creteBST(arr, start, mid-1);
        root.right=creteBST(arr, mid+1, end);
        return root;
    }
    public static void main(String args[]){
        int arr[]={3,5,6,8,10,11,12};
  /*
   *             8
   *           /   \
   *         5      10
   *        / \        \
   *       3   6        11 
   */
  Node root=creteBST(arr, 0, arr.length-1);
  preOrder(root);
    }
}