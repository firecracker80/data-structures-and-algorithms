public class Node {
  Node head;
  Node next;
  int data;

  public Node(Node head) {
    this.head = head;
    this.next = null;
    this.data = data;
  }

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}

