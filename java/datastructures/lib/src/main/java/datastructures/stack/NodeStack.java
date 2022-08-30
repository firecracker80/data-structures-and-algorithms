package datastructures.stack;

public class NodeStack <T>{
  public T value;
  public NodeStack <T> next = null;
  public NodeStack(T value){
    this.value = value;

  }
  public NodeStack(){
    //empty
  }
}
