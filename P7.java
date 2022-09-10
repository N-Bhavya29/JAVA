import java.util.Scanner;

public class P7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String name= sc.nextLine();
        System.out.print("String is : ");
        System.out.println(name);
        int size = name.length();
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0; i < size/2; i++) {
            int front=i;
            int back = size -1-i;
            
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
            
        }
        System.out.println("String is being reversed....");
        System.out.print("String is revered : "+sb);
        
    }
}
