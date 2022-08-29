package datastructures.queue;
import datastructures.stack.Stack;
public class pseudoQueue {
  private Stack<Integer> stack1 = new Stack<Integer>();
  private Stack<Integer> stack2 = new Stack<Integer>();

  public void enqueue(int x){
    while(stack1.isEmpty()){
      stack1.push(x);
    }
    return stack1;
  }
}
