
public class Prime_No {

	public static void main(String[] args) {
		int n=100;
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		
			System.out.println("Prime no");
			else
				System.out.println("Not a prime no");
	}
}
