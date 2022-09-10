//Program to check valid E-mail.
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
public class P9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email :- ");
        String a = sc.nextLine();
        sc.close();
        ArrayList<String> emails = new ArrayList<String>();
        emails.add(a);
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println("email "+": "+ matcher.matches());
        }
    }
}