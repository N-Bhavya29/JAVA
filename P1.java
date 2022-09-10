import java.util.*;

public class P1{
    public static void main(String[] args){
        System.out.println("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter second number : ");
        double b = sc.nextDouble();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Enter your choice " );
        int ch= sc.nextInt();
        sc.close();
        switch(ch){
        case 1:
            double sum=a+b;
            System.out.println(sum);
            break;
        case 2:
            double sub=a-b;
            System.out.println(sub);
            break;
        case 3:
            Double mul =a*b;
            System.out.println(mul);
            break;
        case 4:
            double div=a/b;
            System.out.println(div);
            break;
        }
        // if (ch == 1)
        // {
        //     double sum=a+b;
        //     System.out.println(sum);
        // }
        // else if(ch == 2)
        // {
        //     double diff=a-b;
        //     System.out.println(diff);
        // }
        // else if(ch == 3)
        // {
        //     double mul=a*b;
        //     System.out.println(mul);
        // }
        // else {
        //     double div=a/b;
        //     System.out.println(div);    
        //     }
    }
}