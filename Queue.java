public class Queue<E> {
    private E[] data;
    private int f = 0;
    private int sz = 0;
    int capacity;
    int rear;
    public Queue(){
        
    }
    
    public Queue(int capacity){
        data = (E[])new Object[capacity];
        this.capacity = capacity;
        
    }
    public String size(){
        return sz + " active customer(s) currently";
    }
    public boolean isEmpty(){   
    return (sz == 0);
    }
    public void enqueue(E e) {
        if (sz == data.length)System.out.println("Accomodation is full");
        else{
          rear = (f + sz) % data.length;
          data[rear]=e;
          sz++;
          //System.out.println(e);
        }
    }
    public E dequeue() {
        if (isEmpty()) {return null;}
          E answer = data[f];
          f = (f+1) % data.length;
          sz--;
          return answer;
        }
    
    
    public E first(){
      if (isEmpty()){return null;}
      return data[f];
    }
    public void display() {
      //System.out.println("\nFront index-> " + f);
      //System.out.println("Items-> ");
      for(int j = f; j < data.length; j++) {
        if (data[j]== null){
          continue;
        }else{
        System.out.print(data[j]+"\n");
        }
        
      }
      System.out.print("\n");
      //System.out.println("Rear index-> "+ rear);
    }
    //public static void main(String[] args) {
      //  Queue q = new Queue(5);
        //q.dequeue();
        //for (int i = 1; i<6; i++){
          //  q.enqueue(i);
        //}
        //q.enqueue(6);
        //q.display();
        //q.dequeue();
        //q.display();
    //}
}