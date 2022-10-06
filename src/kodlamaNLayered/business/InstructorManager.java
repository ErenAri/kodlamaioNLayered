package kodlamaNLayered.business;

import kodlamaNLayered.core.loggers.Logger;
import kodlamaNLayered.dataAccess.InstructorDao;
import kodlamaNLayered.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        this.instructorDao.add(instructor);

        for(Logger logger : loggers){
            logger.log(instructor.getFirstName() + " "+ instructor.getLastName());
        }
    }

    public void update(Instructor instructor) {
        this.instructorDao.update(instructor);

        for(Logger logger : loggers){
            logger.log(instructor.getFirstName() + " "+ instructor.getLastName());
        }
    }

    public void delete(Instructor instructor) {
        this.instructorDao.delete(instructor);

        for(Logger logger : loggers){
            logger.log(instructor.getFirstName() + " "+ instructor.getLastName());
        }
    }
}
