package casestudy;

public class App {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student s1 = new Student(1,"KC","19-Jan-1999");
//    	Info in= new Info();
//    	in.display(s1);
		App a=new App();
		a.scenario1();
	}
	public void scenario1()
	{		
		Student s4 = new Student(1,"KC","19-Jan-1999");
		Student s2 = new Student(2,"KC1","20-Jan-1999");
		Student s3 = new Student(3,"KC2","21-Jan-1999");
		Info in= new Info();
		in.display(s4);
		in.display(s2);
		in.display(s3);
	}

}
