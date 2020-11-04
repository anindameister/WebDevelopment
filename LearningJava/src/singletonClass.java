
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
