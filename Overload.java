public class Overload{
    int  value1;
    int  value2;
    Overload(){
     value1 = 30;
     value2 = 50;
    
   }
   Overload(int a){
    value1 = a;
    
  }
  Overload(int a,int b){
  value1 = a;
  value2 = b;
 
 }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}
public static void main(String args[]){
  Overload d1 = new Overload();
  Overload d2 = new Overload(10,20);
  Overload d3 = new Overload(40,60);
  System.out.println("Inside default ");
  d1.display();
  System.out.println("Inside paramaterized Constructor1");
  d2.display();
  System.out.println("Inside paramaterized Constructor2");
  d3.display();
}
}