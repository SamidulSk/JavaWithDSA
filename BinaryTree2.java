// find height of a tree
public class BinaryTree2 {
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
  public static int diameter(Node root){ // O(n^2)
      if(root==null){   // ** Final diameter is maximum of left diameter and right diameter and selfdiameter
        return 0;           // selfdiameter =left height+right height+1;
      }
      int leftDiameter=diameter(root.left);
      int leftHeight=height(root.left);
      int rightDiameter=diameter(root.right);
      int rightHeight=height(root.right);
      int selfDiameter=leftHeight+rightHeight+1;    // diameter which pass through root node
     return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));

    }
    // Approach 2 for find diameter   >>>O(n)
    static class Info{            //make a info class which have both Info
      int diameter;
      int height;
      public Info(int diameter,int height){  //function returns Info class
        this.diameter=diameter; 
        this.height=height;
      }}
      public static Info diameter2(Node root){
        if(root==null){
          return new Info(0, 0);
        }
       Info leftInfo=diameter2(root.left);
       Info rightInfo=diameter2(root.right);
       int diameter=Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.height+rightInfo.height+1); 
       int height=Math.max(leftInfo.height,rightInfo.height)+1;
       return new Info(diameter,height);
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
    System.out.println(height(root));
    System.out.println(count(root));
    System.out.println(sumOfNodes(root));
    System.out.println("diameter is "+diameter(root));
    System.out.println(diameter2(root).diameter);
    System.out.println(diameter2(root).height);

  }
}