package typecasting;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type casting");
		int a='A';
		System.out.println("value of a: "+a);
		
		int b=a;
		System.out.println("value of b: "+b);
		
		float c=a;
		System.out.println("value of c: "+c);
		
		double e=a;
		System.out.println("value of e: "+e);
		
		System.out.println("\n");
		
		System.out.println("Explicit type catsing");
		
		double m=20.4;
		int n=(int)m;
		System.out.println("value of m: "+m);
		System.out.println("value of n: "+n);
	}
}
