package datastructures.binaryTree;

import java.util.ArrayList;

public class BinaryTree {
  Node root;
  private ArrayList<Integer> treeArray = null;



  public BinaryTree(Node root) {
    this.root = null;
  }

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

//  public T push(){
//    T = Node.value;
//    return Node.value;
//  }

  public void preOrder(Node node){
    if(node != null){
      preOrder(Node.left);
      preOrder(Node.right);
    } else if (node == null) {
        treeArray.add(node.value);
    }
  }
}
