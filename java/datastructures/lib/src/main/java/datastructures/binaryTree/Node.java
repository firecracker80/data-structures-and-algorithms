package datastructures.binaryTree;

public class Node {
  static int value;
  static Node left;
  static Node right;

  public Node(int value, Node left, Node right) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }
}

//Referenced BaelDung.
