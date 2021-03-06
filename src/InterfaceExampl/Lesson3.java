package InterfaceExampl;

interface MyInterface5{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void existingMethod(String str);  
}  
interface MyInterface2{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void disp(String str);  
} 
public class Lesson3 implements MyInterface5, MyInterface2{ 
	// implementing abstract methods
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void disp(String str){
    	System.out.println("String is: "+str); 
    }
    //Implementation of duplicate default method
    public void newMethod(){  
        System.out.println("Implementation of default method");  
    }  
    public static void main(String[] args) {  
    	Lesson3 obj = new Lesson3();    	
    	//calling the default method of interface
        obj.newMethod();     
    
    }  
}

