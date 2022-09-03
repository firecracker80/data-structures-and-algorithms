public class Linkedlist {
  Node head;

  class Node{
    int data;
    Node next;

    Node(int x){
      data = x;
      next = null;
    }
  }

  public Linkedlist insert(Linkedlist list, int data){
    Node newNode = new Node(data);
    if(list.head == null){
      list.head = newNode;
    } else{
      Node last = list.head;
      while(last.next != null){
        last = last.next;
      }
      last.next = newNode;
    }
    return list;
  }

}
