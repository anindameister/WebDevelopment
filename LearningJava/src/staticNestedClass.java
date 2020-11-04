
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
