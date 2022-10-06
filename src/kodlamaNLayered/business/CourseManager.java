package kodlamaNLayered.business;

import java.util.List;

import kodlamaNLayered.core.loggers.Logger;
import kodlamaNLayered.core.valid.CourseValidator;
import kodlamaNLayered.dataAccess.CourseDao;
import kodlamaNLayered.entities.Course;

public class CourseManager {
	private List<Course> courses;
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(List<Course> courses,CourseDao courseDao, Logger[] loggers) {
        this.courses = courses;
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        CourseValidator.isCoursePriceZeroOrLess(course);
        this.courses.add(course);
        this.courseDao.add(course);

        for(Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

    public void update(Course course) throws Exception {
        CourseValidator.isCourseNameUnique(courses, course);
        this.courses.add(course);
        this.courseDao.update(course);

        for(Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

    public void delete(Course course) {
        this.courseDao.delete(course);

        for(Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }
}
