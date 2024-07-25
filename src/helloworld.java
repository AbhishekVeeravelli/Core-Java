	class calculator
	{
		int n3;//This is a instance variable
		public int add(int n1,int n2) {//Here n1 and n2 are local variables
			return n1+n2;
			
		}
		
//		public int add(int n1,int n2,int n3) {
//			return n1+n2+n3;
//		}
	}


public class helloworld {
	
	public static void main(String[] args) {
		
		int data=10; //local variable
		
		calculator obj=new calculator();
		int r1= obj.add(3,4);
		//int r2=obj.add(3, 4,5);
		System.out.println(r1);
		//System.out.println(r2);

	}

}
