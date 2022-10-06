package kodlamaNLayered.entities;

public class Instructor {
	private int InstructorId;
	private String FirstName;
	private String LastName;
	public Instructor(int InstructorId, String FirstName, String LastName) {
		super();
		this.InstructorId  = InstructorId;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	public int getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
}
