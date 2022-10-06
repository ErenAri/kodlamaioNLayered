package kodlamaNLayered.dataAccess;

import kodlamaNLayered.entities.Course;
import kodlamaNLayered.entities.Instructor;

public interface InstructorDao {
	void add(Instructor ınstructor);
	void update(Instructor ınstructor);
	void delete(Instructor ınstructor);
}
