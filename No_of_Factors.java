
public class No_of_Factors {

	public static void main(String[] args) {
		int n=200;
		int c=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
