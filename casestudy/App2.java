package casestudy;

public class App2 {

	
		public static void main(String[] args) {
			App2 a=new App2();
			a.scenario2();
		}
		public void scenario2()
		{
			Student s5 = new Student(5,"KC5","22Jan1999");
			Student s6 = new Student(6,"KC6","22Jan1997");
			Student s7 = new Student(7,"KC7","22Jan1998");
			Info in= new Info();
		
			Student studentarr[]=new Student[3];
			studentarr[0]=s5;
			studentarr[1]=s6;
			studentarr[2]=s7;
			for(int i=0;i<studentarr.length;i++)
				in.display(studentarr[i]);
		}
	

}
