
public class Constructor1 {
	int id;
	String name;
	int age;
	Constructor1(int i,String n)
	{
		id =i;
		name=n;
	}
	Constructor1(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println( id +" "+name+" " +age);
	}
	public static void main(String[] args) {
		Constructor1 c= new Constructor1(121,"vish"); 
		Constructor1 x=new Constructor1(122,"vishu",25);
		c.display();
		x.display();
		/*System.out.println(c);
		System.out.println(x);*/
		

	}

}
