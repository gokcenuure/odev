package �dev;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student(1, "G�K�ENUR ", "gokceenure@icloud.com");
        Student student2=new Student(2,"YUSUF KER�M", "yusufff@gmail.com");
        
        
        Student[] students= {student1, student2};
        
        for(Student student: students) {
        System.out.println(student.fullName); 
	} 
        System.out.println(students.length);
	
	
	    Instructor instructor= new Instructor(7, "ENG�N DEM�ROG");
	  
	    
	    Category category1=new Category("T�m�");
	    
	    Category category2=new Category("Programlama");
	    
	    
	    Course course1=new Course("Java Geli�tirici Yeti�tirme Kamp�");
	    Course course2=new Course("Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
	    Course course3=new Course("Programlamaya Giri� ��in Temel Kurs");
	    
	    CourseManager courseManager=new CourseManager();
        Course[] courses = {course1,course2,course3};    {
        
        for(Course course: courses) {
	    System.out.println(course.getName());
	    
	  
        }
        courseManager.addToCourses(course1);
	    courseManager.addToCourses(course2);
	    courseManager.addToCourses(course3);
        
        }
	}}

