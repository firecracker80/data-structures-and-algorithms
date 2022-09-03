package datastructures.linkedlist;

public class LinkedList
{
  public static class Linkedlist {
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

  public boolean includes(int data){
    if(Linkedlist = data){
      return true;
    } else{
      return false;
    }
  }

  public String toString()
    {
        return "node: " + newNode;
    }
}
