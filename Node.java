import java.util.ArrayList;
import java.util.List;

public class Node <E>{
  private String subscription;
  private String Name;
  private Node <E> child = null;
  private Node <E> parent = null;
  private List<Node<E>> children = new ArrayList<>();

  public Node(String subscription){
    this.subscription = subscription;
  }

  public Node(String subscription, String Name){
    this.subscription = subscription;
    this.Name = Name;
  }

  public String getSubscription(){return subscription;}
  public void setSubscripition(String subscription){this.subscription = subscription;}

  public void setChild(Node <E> child){
    this.child = child;
  }

  public void setParent(Node <E> parent){
    this.parent = parent;
  }

  public String getName(){return Name;}

  public Node <E> addChild(Node <E> child){
    children.add(child);
    child.setParent(this.parent);
    return child;
  }

  public void getChildren(){
     children.forEach((n)->System.out.println(n.toString()));
    }
  @Override
  public String toString(){
   return "Customer: "+this.getName()+"\nPackage: "+ this.getSubscription() +"\n";
  }
  
  
  }

