
public class LifeScience extends Courses {
	public LifeScience(){
		
	}
	public LifeScience(String title,int number, String description){
		this.title = title;
		this.number = number;
		this.description = description;
		
	}
	@Override
	public String toString() {
		return "LifeScience [title=" + title + ", number=" + number
				+ ", description=" + description + "]";
	}
		
}

