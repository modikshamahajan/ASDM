package assignment;

import java.util.Scanner;

public class Student {


	int rollno,age; 
	float score;
	String name;
	
	
	public Student(String name,int rollno,int age,float score)
	{
		this.rollno=rollno;
		this.age=age;
		this.score=score;
		this.name=name;
	}
		
	public void display()
	{
		System.out.println("Name="+name+" Roll no= " +rollno+ " Age=" +age+ " Score="+score);
	}
	
   public static void main(String args[])
 {
   Student S[]=new Student[2];	
  Scanner s=new Scanner(System.in);
  for(int i=0;i<S.length;i++)
  {
  System.out.println("enter the name of student");
      String name=s.next();
      
      System.out.println("enter the roll no of student");
     int r=s.nextInt();
      
      System.out.println("enter the age of student");
     int a=s.nextInt();
      
      System.out.println("enter the score of student");
      float score=s.nextFloat();
      
      Student S1=new Student(name,r,a,score);
      S[i]=S1;
      
   }
  for(int i=0;i<S.length;i++)
  {
	  
	  if(S[i].score>0 && S[i].score<50)
	  {
		  S[i].display();
	  }
	  
	  if(S[i].score>=50 && S[i].score<65)
	  {
		  S[i].display();
	  }
	  
	  if(S[i].score>=65 && S[i].score<80)
	  {
		  S[i].display();
	  }
	  
	  if(S[i].score>=80 && S[i].score<100)
	  {
		  S[i].display();
	  }
   
	
			
}
	
 }  
}
