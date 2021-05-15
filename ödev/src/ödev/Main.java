package ödev;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student(1, "GÖKÇENUR ", "gokceenure@icloud.com");
        Student student2=new Student(2,"YUSUF KERÝM", "yusufff@gmail.com");
        
        
        Student[] students= {student1, student2};
        
        for(Student student: students) {
        System.out.println(student.fullName); 
	} 
        System.out.println(students.length);
	
	
	    Instructor instructor= new Instructor(7, "ENGÝN DEMÝROG");
	  
	    
	    Category category1=new Category("Tümü");
	    
	    Category category2=new Category("Programlama");
	    
	    
	    Course course1=new Course("Java Geliþtirici Yetiþtirme Kampý");
	    Course course2=new Course("Yazýlým Geliþtirici Yetiþtirme Kampý");
	    Course course3=new Course("Programlamaya Giriþ Ýçin Temel Kurs");
	    
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

