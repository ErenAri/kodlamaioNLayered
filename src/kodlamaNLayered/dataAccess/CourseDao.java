package kodlamaNLayered.dataAccess;

import kodlamaNLayered.entities.Category;
import kodlamaNLayered.entities.Course;

public interface CourseDao {
	void add(Course course);
	void update(Course course);
	void delete(Course course);
}
