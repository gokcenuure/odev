package ödev;

public class Course {
	
	private String name;
    
	public Course() {
		System.out.println("Ben çalýþtým");
	}
	
	
	public Course(String name) {
		super();
		this.name=name;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
