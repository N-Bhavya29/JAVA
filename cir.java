import java.util.*;



public class cir
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circul:");
		float r=s.nextFloat();
		double p=Math.PI*r*r;
		System.out.println("Area of circul is:"+p);
	}
}