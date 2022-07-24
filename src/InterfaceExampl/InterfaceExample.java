package InterfaceExampl;

import java.util.Scanner;

//abstract class can have constructor 
/* In interfaces we can’t have constructors.
 * we cannot create an object of interface.
 * all the fields are public, static and final and 
 * all the methods are public and abstract by default in an interface.
 * an interface can extend another interface.
 */
interface maths{
	 public void add();
	 public void sub();
	 public void mul();
	 public void div();
	 
	
}
public class InterfaceExample implements maths{
	
	public void add() {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter any two integer values to perform addition");
         int a=input.nextInt();
         int b=input.nextInt();
         int s= a+b;
         System.out.println("Sum of "+a+" and "+b+" is "+s);
	   
	}
	public void sub() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter any two integer values");
        int a=input.nextInt();
        int b=input.nextInt();
        int s= a-b;
        System.out.println("Subtraction of "+a+" and "+b+" is "+s);
	}
	
	 public void mul() {
		    Scanner input= new Scanner(System.in);
			System.out.println("Enter any two integer values");
	        int a=input.nextInt();
	        int b=input.nextInt();
	        int s= a*b;
	        System.out.println("Multiplication of "+a+" and "+b+" is "+s);
	 }
	 
	 public void div() {
		    Scanner input= new Scanner(System.in);
			System.out.println("Enter any two integer values");
	        int a=input.nextInt();
	        int b=input.nextInt();
	        int s= a/b;
	        System.out.println("division of "+a+" and "+b+" is "+s);
	 }
	
	
	public static void main(String[] args) {
		 InterfaceExample obj1 =new InterfaceExample();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
	}

}
