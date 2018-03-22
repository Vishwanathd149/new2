
public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(add(12,36));
		System.out.println(add(3.14,4.89));
		System.out.println(add("vishu","shilpa"));
		
	}
public static int add(int a,int b)
{
	return (a+b);
}

public static double add(double a,double b) {
	return(a+b);
	
}

public static String add(String a , String b) {
	return(a+" "+b);
}
}
