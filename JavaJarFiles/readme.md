#### after oops

# What is Static Keyword in Java | static method and static variable [[2]](#2).

# constructor [[1]](#1).

# How to use Static Block in Java Tutorial [[3]](#3).

- how can you print hi, without using the main method
- answer is by using static block
- the static block is loaded first and then the main method into JVM

# Learn Java Programming - Static Nested Classes Tutorial [[4]](#4).

- check out the compilation part in the video
- and pay attention to the later part

```
public class staticNestedClass {

	public static void main(String[] args) {
		notPartOfLearningJava.staticNestedClass.displayStaticVariableNested();
		

	}
	
	

}

class notPartOfLearningJava{
	String primitiveReferenceTypeVariable= "just a reminder that string is a reference type though used as primitive";
	public void sayMyName() {
		System.out.println("OMG!Aninda");
	}
	private static String staticVariablePrivatised="the static string which is privatised";
	static class staticNestedClass{
		static String staticVariableNested="the static variable which is nested";
		static void displayStaticVariableNested() {
			System.out.println(staticVariableNested);
			System.out.println(staticVariablePrivatised);
			notPartOfLearningJava justAnObject=new notPartOfLearningJava();
			justAnObject.sayMyName();
			System.out.println(justAnObject.primitiveReferenceTypeVariable);
			System.out.println(new notPartOfLearningJava().primitiveReferenceTypeVariable+"THE OTHER WAY");
			
		}
	}
}
```
# What is Singleton Class in Java | Singleton Design Pattern Part 1 [[5]](#5).

- example [[6]](#6). 53min

```
public class singletonClass {
	
	public static void main(String[]args) {
//		creatingSingletonClass newObject=new creatingSingletonClass();
		//the above gives an error stating that constructor creatingSingletonClass() is not visible
		creatingSingletonClass newObject=creatingSingletonClass.getInstance();
		creatingSingletonClass newObject2=creatingSingletonClass.getInstance();
		
	}

}

class creatingSingletonClass
{
	//step1: create a static object or static instance of the class
	// in the class itself, we're creating the instance which is object
	static creatingSingletonClass object=new creatingSingletonClass();
	
	//step2: dont allow user to create instance, with default constructor
	// in order to do this, we're defining a constructor which is private
	private creatingSingletonClass()
	{
		
	}
	
	//step3:creating a static method and within this method, we'll return the object
	public static creatingSingletonClass getInstance() {
		return object;
		
	}
}
```

- Immutable Objects : These are of in-built types like int, float, bool, string, unicode, tuple. 
- In simple words, an immutable object can't be changed after it is created. 
- Mutable Objects : These are of type list, dict, set . Custom classes are generally mutable.

- https://start.spring.io/

## References
<a id="1">[1]</a> 
https://www.youtube.com/watch?v=lrIlVcsZrx0

<a id="2">[2]</a> 
https://www.youtube.com/watch?v=-TxHjyC8WY4

<a id="3">[3]</a> 
https://www.youtube.com/watch?v=dCvEChffnTA

<a id="4">[4]</a> 
https://www.youtube.com/watch?v=x5GXFHUr5dg

<a id="5">[5]</a> 
https://www.youtube.com/watch?v=KUTqnWswPV4

<a id="6">[6]</a> 
https://www.youtube.com/watch?v=uhp3GbQiSRs&t=2316s