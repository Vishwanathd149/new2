
public class Mthds {

	public static void main(String[] args) {
		hello("vish");
		hello("ashwini");
		hello("akshata");
		hello("ateeksh & atharv");
		int sum =add(2,4);
		int product=sum*10;
		System.out.println(product);
		
		}
	public static void hello(String name) {
		System.out.println(" string name " + name );
		
	}
	 public static int add(int a,int b) {
		 
		 //System.out.println (a+b);
		 return(a+b);
	 }

}
