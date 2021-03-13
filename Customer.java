import java.util.*;
public class Customer{
  String Name; 
  String Subscription_type;
  int year; 
  String ID;
  public Customer(){}
  public Customer(String name,String Subscription_type, int year){
    this.Name = name;
    this.Subscription_type = Subscription_type;
    this.year = year;
     Random rnd = new Random();
    int number = rnd.nextInt(999999);
    this.ID = String.format("%06d", number);
    //return ID;

  }

  public String getName(){
    return Name;
  }

  public String getID(){
    //Random rnd = new Random();
    //int number = rnd.nextInt(999999);
    //this.ID = String.format("%06d", number);
    //return ID;
    return ID;

    
  }

  public int getYear(){
    return year;
  }

  public void setYear(int year){
    this.year = year;
  }

  public String getSubscription_type(){
    return Subscription_type;
  }
  
  @Override
  public String toString() {
   return "Customer: "+this.getName()+"\nID: "+this.getID()+"\nPackage: "+ this.getSubscription_type() +"\nYear of Subscription: "+this.getYear()+"\n";
  }
     
  
}
