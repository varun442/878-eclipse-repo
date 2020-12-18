package casestudy;
import java.util.*;

public class App3 {

	public static void main(String[] args) {
		App3 a=new App3();
		a.scenario2();
	}
	public void scenario2()
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String stud[]=new String[10];
		String name[]=new String[10];
		int id[]=new int[10];
		String dob[]=new String[10];
		
		Info in= new Info();
		System.out.println("Please enter the student details");
		
		for(int i=0;i<stud.length;i++)
			{
			System.out.println("Please enter the id");
			id[i]=sc.nextInt();
			System.out.println("Please enter the name");
			name[i]=sc.nextLine();
			System.out.println("Please enter the dob");
			dob[i]=sc.nextLine();
			count++;
			System.out.println("Please enter 0 to stop entering");
			
			int a=sc.nextInt();
			
			if(a==0)
				break;
			}
			System.out.println();
		Student stu[] = new Student[count];
		for(int j=0;j<stu.length;j++)
			 stu[j]=new Student(id[j],name[j],dob[j]) ;
		for(int k=0;k<stu.length;k++)
			in.display(stu[k]);
	}

}
