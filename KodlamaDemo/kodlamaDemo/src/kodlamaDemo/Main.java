package kodlamaDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName="ali";
		instructor.lastName="Veli";
		instructor.lessons="C#";
		instructor.phoneNumber="00000000000";
		instructor.email="Ali@kodlama.com";
		instructor.password="1222";
		
		Student student = new Student();
		student.firstName ="Oya";
		student.lastName ="deniz";

		
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		User[] users = {instructor,student};
		
		userManager.allList(users);
		
		
		
		
	}

}
