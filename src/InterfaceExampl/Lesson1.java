package InterfaceExampl;

//https://beginnersbook.com/2017/10/java-8-stream-tutorial/
interface MyInterface{
	 /* This is a default method so we need not
    * to implement this method in the implementation 
    * classes  
    */
	default void newMethod(){  
       System.out.println("Newly added default method");  
   } 
	
	/* Already existing public and abstract method
    * We must need to implement this method in 
    * implementation classes.
    */
	void existingMethod(String str); 
	
	
	/* This is a static method. Static method in interface is
     * similar to default method except that we cannot override 
     * them in the implementation classes.
     * Similar to default methods, we need to implement these methods
     * in implementation classes so we can safely add them to the 
     * existing interfaces.
     */
    static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    }
}

public class Lesson1 implements MyInterface{
	
	// implementing abstract method
	public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson1 obj1= new Lesson1();

		 obj1.newMethod();
		 
		 //calling the abstract method of interface
		 obj1.existingMethod("Java 8 is easy to learn"); 
		 
		//calling the static method of interface
		 MyInterface.anotherNewMethod();
		 
		 
	}

}
