//calculate Area of triangle by using class and its method 
import java.util.Scanner;
class triangle{
    public void areaOfTriangle(double h,double b){
    double a=(h*b)/2;
    System.out.println("Area of Triangle : "+a);
    }
}
public class P10 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter height of triangle : ");
    double h =sc.nextDouble();
    System.out.print("Enter base/breadth of triangle : ");
    double b = sc.nextDouble();
    sc.close();
    triangle t=new triangle();
    t.areaOfTriangle(h, b);
    }
}
