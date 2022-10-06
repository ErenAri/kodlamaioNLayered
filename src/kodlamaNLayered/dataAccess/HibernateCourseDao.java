package kodlamaNLayered.dataAccess;

import kodlamaNLayered.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs hibernate ile veritabanı eklendi=> "+ course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Kurs hibernate ile veritabanı güncellendi=> "+ course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs hibernate ile veritabanından silindi=> "+ course.getCourseName());
		
	}

}
