package Faculty;

import java.util.Scanner;

public class Faculty {
 int id;
 double salary;
 
 public  Faculty()
 {}
 
 public Faculty(int id, double salary)
 {
	 this.id= id;
	 this.salary= salary;
 }
 
 public void display()
 {
	 System.out.println("Faculty ID:- "+id);
 }
 
 public void accept()
 {
	 Scanner n = new Scanner(System.in);
	 int i = n.nextInt();
 }
 
}
