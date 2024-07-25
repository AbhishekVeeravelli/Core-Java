class student{
	int rollno;
	String name;
	int marks;
	
}


public class demo {
	public static void main(String args[]) {
//		student s1=new student();
//		student s2=new student();
//		student s3=new student();
//
//		s1.rollno=1;
//		s1.name="Abhi";
//		s1.marks=11;
//		
//		s2.rollno=1;
//		s2.name="Abhi";
//		s2.marks=11;
//		
//		s3.rollno=1;
//		s3.name="Abhi";
//		s3.marks=11;
//		
//		student student[]=new student[3];
//		
//		student[0]=s1;
//		student[1]=s2;
//		student[2]=s3;
//		
//		for(int i=0;i<student.length;i++) {
//			System.out.println(student[i].rollno+student[i].name+student[i].marks);
//			
//		}
		
		StringBuffer sb=new StringBuffer("Abhi");
		sb.append("shek");
		
		//String str=sb.toString();
		sb.deleteCharAt(2);
		sb.insert(0, "Java" );
		sb.substring(0);
		System.out.println(sb);
	}

}
