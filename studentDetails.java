package student;
import java.util.*;
class StudentTest
{
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total()
	{
		return m1+m2+m3;
	}
	public float average()
	{
		return (float)total()/3;
	}
	public char grade()
	{
		if (average()>60)
			 return 'A';
		else 
			return 'B';
	}
	public String details()
	{
		return "Roll No:"+ roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
	
}

public class Student{
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		StudentTest s=new StudentTest();
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter roll");
	    System.out.println("Enter name");
	    System.out.println("Enter course");
	    System.out.println("Enter marks of m1");
	    System.out.println("Enter marks of m2");
	    System.out.println("Enter marks of m3");
		s.roll=sc.nextInt();
		s.name=sc.next();
		s.course=sc.next();
		s.m1=sc.nextInt();
		s.m2=sc.nextInt();
		s.m3=sc.nextInt();
		System.out.println("details:\n"+s.details());
		System.out.println("Total:"+s.total());
		System.out.println("Average:"+s.average());
		System.out.println("grade:"+s.grade());

		
	}

}
