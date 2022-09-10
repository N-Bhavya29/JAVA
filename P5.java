import java.util.Scanner;

public class P5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int x = sc.nextInt();
        int array[]= new int[x];

        //input
        for (int i = 0; i < x; i++) {
            System.out.print("Enter element at index  " + i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Array is : ");
        
        //print array
        for (int j = 0; j < x; j++) {
            System.out.print(array[j]+" ");
        }
        int a = array[0];//largest number
        int b = array[0];//smallest number
        for (int i = 0; i < array.length; i++) {
            if (array[i]>a) {
                a=array[i];
            }
            else if(array[i]<b){
                b=array[i];
            }
        }
        System.out.println("\n\nlargest element in array is : "+ a);
        System.out.println("\nsmallest number is array is : "+ b);
    }
}