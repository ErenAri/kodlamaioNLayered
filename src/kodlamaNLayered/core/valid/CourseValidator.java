package kodlamaNLayered.core.valid;

import java.util.List;

import kodlamaNLayered.entities.Course;

public class CourseValidator {
	public static void isCoursePriceZeroOrLess(Course course) throws Exception{
		if (course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0 ve aşağısı olamaz !!!");
		}
	}
	
	public static void isCourseNameUnique(List<Course> courses, Course course) throws Exception{
		for(Course c:courses) {
			if(c.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz yeni bir isim deneyin!!");
			}
		}
	}

}
