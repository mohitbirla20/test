/* Day-2 Assignment */

/*  
 Question No. 1 :- 
 
 
 Type casting is a way of converting data
  from one data type to another data type. 
  This process of data conversion is also 
  known as type conversion or type coercion. 
  In Java, we can cast both reference and primitive 
  data types. By using casting, data can not be
  changed but only the data type is changed.
  
  We have two type of typeCasting :- 
  1. Implicit typeCasting :- it change smaller data type value
                       into a bigger data type value;
                       
      Example :- int x= 20;
                 long y = 20;
                 
   2. Explicit typeCasting :- it change bigger data type value 
                        into a small data type value;
                        
 Example :- int =10;
            byte b = x; (it gives us error)
            
            byte b = byte(x);
 */



/* Que. 2 :- */

package com.masai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String city = "Delhi" ;
      
      switch (city){
      case "Mumbai": System.out.println("Financial city");
      break; 
      
      case "Kolkata" : System.out.println("City of joy");
      break; 
      
      case "Delhi" : System.out.println("Capital of the country");
      break; 
      
      case "Bangalore" : System.out.println("Cyber city");
      break; 
      
      default : System.out.println("May be Other Indian City");
      }
      
	}

}





/* 
 Q3) Explain the difference between local and instance variables?
 
 Instance Variable: These variables are declared within 
  a class but outside a method, constructor, or block and 
  always get a default value.

These variables are usually created when we create an 
object and are destroyed when the object is destroyed.
We may use an access specifier, for instance, variable,
 and if no access specifier is specified, then  default 
 access specifier is used.
Each and every object will have its own copy of 
instance variables. 

Ex. :- class Example  
{  
   int count; ( Count is an Instance variable  )
   
}

Local Variable: These variables are declared within a 
                method but do not get any default value.

They are usually created when we enter a method or constructor
 and are destroyed after exiting the block or when the call 
 returns from the method.
Its scope is generally limited to a method and its scope 
starts from the line they are declared. Their scope usually 
remains there until the closing curly brace of the method comes.
The initialization of the local variable is mandatory.

Ex. :- int area()      
{    
        int length = 10; // Local variable          
        int breadth = 5; // Local variable          
        int rectarea = length*breadth; // Local variable          
        return rectarea;          
} 

*/
