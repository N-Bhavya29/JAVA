import java.util.Scanner;

public class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a= sc.nextInt();
        System.out.print("Enter second Number : ");
        int b= sc.nextInt();
        System.out.print("Enter third Number : ");
        int c= sc.nextInt();
        int max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.print("Gretest number is : "+max);
    }
}
