
public class HumanArts extends Courses {
	public HumanArts(){
		
	}
	public HumanArts(String title,int number, String description){
		this.title = title;
		this.number = number;
		this.description = description;

	}
	@Override
	public String toString() {
		return "HumanArts [title=" + title + ", number=" + number
				+ ", description=" + description + "]";
	}
		
}
