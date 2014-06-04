
public class CoursesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses x = new LifeScience("BIO",107,"Biology of the Environment");
		Courses y = new SocialScience("ECO",110, "Consumuer Economics");
		display(x);
		display(y);
	}
	public static void display(Courses a){
		System.out.println(a);
	}
}
