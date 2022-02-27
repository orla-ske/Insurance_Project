import java.util.ArrayList;
public class CustomerList{
  private int size=0;
  ArrayList <Customer> currentData = new ArrayList <Customer>();

  public CustomerList(){
   
  }

  public Customer addCustomer(Customer x){
    currentData.add(x);
    size++;
    return x;
  }
  
  public void listComponents(String v){
    currentData.forEach((n)->resolve(n,v));
    
    System.out.println(" ");
  }
  public void resolve(Customer e, String v){
    if (e.getID().equals(v)){
    System.out.println(e);
    }
    else
    {System.out.println("User not found");}

  }
  public int getSize(){return size;}

  public void removeCustomer(Customer x){
    currentData.remove(x);
    size--;
  }
}