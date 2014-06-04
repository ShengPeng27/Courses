
/**
 * @author Sheng
 * A set of classes that defines various courses in my curriculum
 */
public class Courses {
	String title;
	int number;
	String description;
	
	//As far as I concerned, the attributes of all courses are the same
	//so I didn't declare new attributes in the subclasses
	public Courses(){
		
	}
	public Courses(String title, int number, String description) {		
		this.title = title;
		this.number = number;
		this.description = description;
	
	}
}
