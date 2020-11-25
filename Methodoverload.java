import java.util.*;

class Methodoverload{
	static int area;
	int Area(int l,int b){
		return area=l*b;
		}
	int Area(int r){
		return area=r*r;
		}
		void display(){
            System.out.println("Area: " +area);
			}
public static void main(String[] args){
    Methodoverload obj = new Methodoverload();
    double a,c;
		a=obj.Area(5, 2);
		System.out.println("area of rectangle is " + a);
		c=obj.Area(9);
		System.out.println("area of circle is " + c);
	}
}