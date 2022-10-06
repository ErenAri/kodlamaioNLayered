package kodlamaNLayered.dataAccess;

import kodlamaNLayered.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen jdbc ile veritabanına eklendi=> "+ instructor.getFirstName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Eğitmen jdbc ile veritabanı güncellendi=> "+ instructor.getFirstName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen jdbc ile veritabanından silindi=> "+ instructor.getFirstName());
		
	}

}
