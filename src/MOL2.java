
public class MOL2 {

	public static void main(String[] args) {
		System.out.println(method1(2,8,9));
		System.out.println(method1(4,8));
		System.out.println(method1("vi","sh"));
		

	}
	
	public static int method1(int a, int b,int c) {
		return(a+b-c);
	}
	public static int method1 (int a ,int b) {
		return(a*b);
	
	}
	public static String method1(String a , String b) {
		return(a+b);
	}

}
