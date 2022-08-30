package datastructures.stack;

import datastructures.linkedlist.Node;

public class Stack<T> {
  private NodeStack<T> top = null;

  public void push(T value){
    NodeStack<T> stack1 = new NodeStack<>(value);
    stack1.next = top;
    top = stack1;
  }
  public T pop(){
    T temp = top.value;
    top = top.next;
    return temp;
  }
  public T peek(){
    return top.value;
  }
  public boolean isEmpty(){
    if(top == null){
      return true;
    } else {
      return false;
    }
  }
}
