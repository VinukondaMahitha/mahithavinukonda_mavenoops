package oops;
import java.util.*;
public class Newyear_gift {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int tw=0;
			int count=0;
			System.out.println("Enter min range of candy");
			int c_l=sc.nextInt();
			System.out.println("Enter max range of candy");
			int c_h=sc.nextInt();
			System.out.println("Enter how many choclates you want to enter");
			int c_n=sc.nextInt();
			dairymilk c[]= new dairymilk[c_n];
			for (int i=0;i<c_n;i++)
			{
				c[i]=new dairymilk();
				System.out.println("Enter the weight of "+(i+1)+"choclate");
				int w=sc.nextInt();
				count=c[i].no_candy(c_l,c_h,count,w);
				tw=c[i].weight(tw,w);
			}
			System.out.println("Enter how many sweets you want to enter");
			int s_w=sc.nextInt();
			Cashew s[]= new Cashew[s_w];
			for (int i=0;i<s_w;i++)
			{
				c[i]=new dairymilk();
				System.out.println("Enter the weight of "+(i+1)+"sweet");
				int w=sc.nextInt();
				s[i]=new Cashew();
				count=s[i].no_candy(c_l,c_h,count,w);
				tw=s[i].weight(tw,w);
			}
			System.out.println("Total weigth of the box="+tw);
			System.out.println("count of candies ="+count);
			
			
		}

	}
