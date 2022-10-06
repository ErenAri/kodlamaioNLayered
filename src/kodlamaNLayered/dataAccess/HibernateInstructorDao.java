package kodlamaNLayered.dataAccess;

import kodlamaNLayered.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen hibernate ile veritabanına eklendi=> "+ instructor.getFirstName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Eğitmen hibernate ile veritabanı güncellendi=> "+ instructor.getFirstName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen hibernate ile veritabanından silindi=> "+ instructor.getFirstName());
		
	}

}
