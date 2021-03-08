import java.util.ArrayList;

public class LearnJava {

	public static void main(String[] args) {
		Animal a = new Animal(); //format used when making a new object
		String dog = a.iAmDog(); //calling a method from another class file
		System.out.println(dog);
		a.doStuff();
		//a class is a java file that helps us make objects
	
		
		
		//primitive types
			//int a = 5; //store a number variable, int stands for integer
			//char b = "i"; //character variable is put inside single quotes
			//long c = 400;
			//double d = 3.2;

		//non-primitive data types
		//String name = "Susan"; //to store a name or multiple character variables
			//String is an object
		//System.out.println(name.toUpperCase()); //the period tells you everything that variable can do
			//a majority of the time, the ones with () are a metho

			/*let's make a method that puts an exclamation mark at the end of whatever strong you want
			 * to start a method, just write some keywords
			*/
			
		//the method has now been created**	
		//String exclaim = addExclamationPoint("hot dogs");
		//System.out.println(exclaim);
		//methods can also be called without the dot operator
	}
		//public static String addExclamationPoint(String s) {
			//System.out.println(s + "!"); //to put 2 strings together, use +
				//characters and strings or anything that's not a number or variable name has to be in quotation marks
				//you'll notice that nothing happens when this is run at this point so the following code has to be added beforehand**
				//the method was not being called
			
		//return the results as a variable (system.out before this was commented for the following)
			//return s + "!"; //the keyword void is actually the type of what you want to bring back, so void in the declared class is changed to String for this part of the example
			
//commonly used objects are
		///ArrayList<Integer> b = new ArrayList<Integer>();
		//a lot of objects will not come in your code so you have to import it
		//hover over the code and click the import suggestion 
		
		//each object has its own methods and each class has its own objects 
		
		}
	}
