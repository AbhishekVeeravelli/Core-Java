class Mobile{
	String brand;
	int price;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
		
	}
	
	public Mobile(){
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
		
	}
	
	public void show() {
		System.out.println(brand+":"+price+":"+name);
		
	}
}


public class Staticpractice {
	public static void main (String []args)throws Exception {
		
		Class.forName("Mobile");
		
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		Mobile.name="Smartphone";
		
		
		
//		obj1.show();
//		obj2.show();
		
		//Mobile.show(obj1);
		
		
	}

}
