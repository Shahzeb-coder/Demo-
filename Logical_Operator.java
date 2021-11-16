
public class Logical_Operator {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		if(a<b && b<a)
			System.out.println(a);
		else if (a<b || b<a)
			System.out.println(b);
		else
			System.out.println(c);
		
		

	}

}
