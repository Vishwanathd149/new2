
public class Constructor3 {
	int l;
	int b;
	int h;
	Constructor3(){
		l=10;
		b=15;
		h=12;
	}
	Constructor3(int x,int y,int z){
		l=x;
		b=y;
		h=z;
		
	}
		public int volume() {
			return(l*b*h);
		}
	public static void main(String[] args) {
		Constructor3 a=new Constructor3();
	
		a.volume();
		System.out.println( "volume of cube " +a.volume() );
		
		Constructor3 b= new Constructor3(4,8,12);
		b.volume();
		System.out.println(b.volume());
	}

}
