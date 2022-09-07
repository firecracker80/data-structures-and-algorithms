package datastructures.binaryTree;

public class BinaryTree {
  Node root;


  public BinaryTree(Node root) {
    this.root = null;
  }

  private void currentNode(int value) {
  }
  public void preOrder(Node node){
    if(node == null){
      return;
    } else {
      currentNode(node.value);
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  public void inOrder(Node node){
    if(node == null){
      return;
    } else{
      inOrder(node.left);
      currentNode(node.value);
      inOrder(node.right);
    }

  }
  public void postOrder(Node node){
    if(node == null){
      return;
    } else {
      postOrder(node.left);
      postOrder(node.right);
      currentNode(node.value);
    }
  }

//  Referenced Baeldung.

  public int findMax(Node node){
    if(node == null){
      return 0;
    } else{
      currentNode(node.value);
      int leftTree = findMax(node.left);
      int rightTree = findMax(node.right);

      if(leftTree > node.value){
        node.value = leftTree;
          if(rightTree > node.value){
            node.value = rightTree;
          }
      }
    }
    return node.value;
  }

//  Referenced GFG.
  private int treeLevel(Node root) {
  }
  public void breadthFirstMove(Node node, int level){
    if(node == null){
      return;
    } else if(level == 0){
      breadthFirstMove(node.left, level-1);
      breadthFirstMove(node.right, level-1);
    }
  }
  public void breadthFirst(){
    int level = treeLevel(root);
    for (int i = 0; i < level; i++){
      breadthFirstMove(root, i);
    }
  }

//  Referenced netjstech.com.


  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }


}
