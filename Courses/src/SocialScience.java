
public class SocialScience extends Courses {
	public SocialScience(){
		
	}
	public SocialScience(String title,int number, String description){
		this.title = title;
		this.number = number;
		this.description = description;

	}
	@Override
	public String toString() {
		return "SocialScience [title=" + title + ", number=" + number
				+ ", description=" + description + "]";
	}		
}
