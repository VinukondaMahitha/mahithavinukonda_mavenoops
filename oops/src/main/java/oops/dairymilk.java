package oops;

public class dairymilk implements Main{
		
		public int weight(int tw,int we)
		{
			tw+=we;
			return  tw;
		}
		
		public int no_candy(int low,int high,int c,int we)
		{
			if(we>=low && we<=high)
			{
				c++;
			}
		return c;	
		}

	}

