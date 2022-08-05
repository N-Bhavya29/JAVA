import java.util.*;
public class minmax {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enrer Array length:");
		int b=s.nextInt();
		int a[]=new int[b];
		int c=a.length;
		int temp=0;
		int temp2=a[0];
		for(int i=0;i<c;i++)
		{
		    System.out.println("Enter array element:");
		    a[i]=s.nextInt();
		}
		for(int j=0;j<c;j++)
		{
		    if(a[temp2]>a[j])
		    {
		        a[temp2]=a[j];
		    }
		    
		}
		System.out.println();
		System.out.println("Smallest Number:"+a[temp2]);		
		for(int i=0;i<c;i++)
		{
		    if(a[temp]<a[i])
		    {
		        a[temp]=a[i];
		    }
		    
		}
		System.out.println();
		System.out.println("Largest Number:"+a[temp]);
				
		
	}
}