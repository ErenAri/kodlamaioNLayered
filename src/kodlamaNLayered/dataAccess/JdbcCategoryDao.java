package kodlamaNLayered.dataAccess;

import kodlamaNLayered.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori jdbc ile veritabanına eklendi=> "+ category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Kategori jdbc ile veritabanı güncellendi=> "+ category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori jdbc ile veritabanı silindi=> "+ category.getCategoryName());
		
	}

}
