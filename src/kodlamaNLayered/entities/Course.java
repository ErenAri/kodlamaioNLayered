package kodlamaNLayered.entities;

public class Course {
	private int courseId;
	private String courseName;
	private Category category;
	private double price;
	
	public Course(int courseId, String courseName, Category category, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.category = category;
		this.price=price;
	}
	public int getCourseId() {
		return courseId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
