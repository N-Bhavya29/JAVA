//Checking String is Palindrome or NOT 
import java.util.*;

public class P8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        //new string
        String reverse="";
        //nstring means New/Original String 
        String nstring = sc.nextLine();
        //string check reverse and store
        int size = nstring.length();
        for (int i = size-1; i >=0; i--) {
            //To reverse String 
            reverse = reverse + nstring.charAt(i);
        }
        if (nstring.equals(reverse)) {
                System.out.println("Yes String is palindrome");
                System.out.println("String is palindrome check it : "+ reverse);
            } else {
                    System.out.println("String is not palindrome");
                    System.out.println("String is Not palindrome check it : "+ reverse);
                }
                System.out.println("Original String is : "+nstring);
            }
}
