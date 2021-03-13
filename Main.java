import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    CustomerList currentData1 = new CustomerList();
    Node<String> root = new Node<>("Health Insurance premium");
    Node<String> root1 = new Node<>("Health Insurance Standard");

    Queue q = new Queue(30);
    System.out.println("Welcome to PremierCare online");
    Scanner maine = new Scanner(System.in);  System.out.print("1.Customer \n2.Admin \n: ");
    String person = maine.nextLine(); 
    int per = Integer.parseInt(person);
    if (per==1){
    Scanner choose = new Scanner(System.in);   System.out.print("Choose an option: \n1.Sign up \n2.Check details \n: ");
    String option = choose.nextLine(); 
    int Opt = Integer.parseInt(option);
    
    if (Opt == 1){

    Scanner Name = new Scanner(System.in);   System.out.println("Enter Full Name: ");
    String userName = Name.nextLine(); 
    Scanner Year = new Scanner(System.in);   System.out.println("Enter Current Year: ");
    String userYear = Year.nextLine(); 
    int Start = Integer.parseInt(userYear);
    Scanner Package = new Scanner(System.in);   System.out.println("Enter Package(e.g. PREMIUM, STANDARD): ");
    String userPackage = Package.nextLine(); 
    Customer A = new Customer(userName,userPackage,Start);
    String x = userPackage.toUpperCase();
    if(x.equals("PREMIUM")){
      Node <String> child1 = new Node<>(userPackage,userName);
      root.addChild(child1);
    }else{
      Node <String> child1 = new Node<>(userPackage,userName);
      root1.addChild(child1);
    }
   
    q.enqueue(A);
    currentData1.addCustomer(A);

    System.out.println("Applied Successfully! Thank you \nID: "+ A.getID());
    Scanner Opt2 = new Scanner(System.in);   System.out.println("Would you like to return to see details? If so please enter *2*: ");
    String Optnew = Opt2.nextLine();
    Opt =Integer.parseInt(Optnew);
    }
    if(Opt==2){
      Scanner Cust = new Scanner(System.in);   System.out.println("Please input your ID: ");
      String code = Cust.nextLine(); 
      currentData1.listComponents(code);
      Scanner Opt2 = new Scanner(System.in);   System.out.println("\n1. Switch to Admin\n ");
      String Optnew = Opt2.nextLine();
      int Option =Integer.parseInt(Optnew);
      if (Option==1){
        per = 2;
      }
      
    }
    }
    if (per ==2){
    Scanner Admin = new Scanner(System.in);   System.out.println("1.View current customers \n2.View Premium Customers \n3.View Standard Customers");
    String chose = Admin.nextLine(); 
    int num = Integer.parseInt(chose);
    
    if (num == 1){
        q.display();
        q.size();
        Scanner Opt2 = new Scanner(System.in);   System.out.println("\n1. View Premium Customers\n2. View Standard Customers\n ");
        String Optnew = Opt2.nextLine();
        int Option =Integer.parseInt(Optnew);
        if (Option==1){
        num = 2;
        }
        if (Option == 2){
        num = 3;
        }
        }if(num == 2){
          root.getChildren();
          
        }if(num == 3){
          root1.getChildren();
          
        }
    }
    
  }
}
    
  