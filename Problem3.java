package Monmouth;

public class Problem3 {
	 public static void main(String[] args) {
		 
		 University university = new University();
		 
		 university.setName("Monmouth University");
		 university.setState("New Jersey");
		 university.setStudents(4000);
		 university.setCost(40000);
		 
		 
		 System.out.println("School: " + university.getName());
		 System.out.println("State: " + university.getState());
		 System.out.println("# of Students: " +university.getStudents());
		 System.out.println("Tuition: $" + university.getCost());
		 
	 }
	
}

class University {
	
	private String name;
	private String state;
	private int students;
	private int cost;

	public University() {
		setName("unknown");
		setState("unknown");
		setStudents(0);
		setCost(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
}

	


	
	
	
	
	
	
			
	
	
 
	
	
	
	
