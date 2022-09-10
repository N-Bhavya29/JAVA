//Bubble sort
import java.util.Scanner;

public class P6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size =sc.nextInt();
        int array[]=new int[size];
        //input
        for (int i = 0; i < size; i++) {
            System.out.print("element on index "+i+" is : ");
            array[i]=sc.nextInt();
        }
        //output
        System.out.println("Array is Unsorted : ");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j]+" ");
        }
        System.out.println();
        //bubble sort 
        int temp = 0;
        //int n = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size-i); j++) {
                if (array[j-1]>array[j]) {
                    //swap element
                    temp =array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Array is Sorted :");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
