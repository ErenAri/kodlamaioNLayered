package kodlamaNLayered;

import java.util.ArrayList;
import java.util.List;

import kodlamaNLayered.business.CategoryManager;
import kodlamaNLayered.business.CourseManager;
import kodlamaNLayered.business.InstructorManager;
import kodlamaNLayered.core.loggers.ConsoleLogger;
import kodlamaNLayered.core.loggers.Logger;
import kodlamaNLayered.core.loggers.SmsLogger;
import kodlamaNLayered.dataAccess.HibernateCourseDao;
import kodlamaNLayered.dataAccess.JdbcCategoryDao;
import kodlamaNLayered.dataAccess.JdbcInstructorDao;
import kodlamaNLayered.entities.Category;
import kodlamaNLayered.entities.Course;
import kodlamaNLayered.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers  = {new ConsoleLogger(), new SmsLogger()};
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		
		Category category = new Category("Yazılım");
		List<Category> categories = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(categories, new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		Course course = new Course(1, "senior kampı", category, 15);
		List<Course> courses = new ArrayList<>();
		CourseManager courseManager = new CourseManager(courses, new HibernateCourseDao(), loggers);
		courseManager.add(course);
		
		System.out.println(instructor1.getFirstName()+
				" isimli eğitmenin "+ 
				category.getCategoryName()+" kategorisindeki "+
				course.getCourseName()+" adlı kursu getirildi."
				);
		
	}

}
