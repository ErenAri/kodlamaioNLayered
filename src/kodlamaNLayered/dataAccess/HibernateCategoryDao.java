package kodlamaNLayered.dataAccess;

import kodlamaNLayered.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori hibernate ile veritabanına eklendi=> "+ category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Kategori hibernate ile veritabanı güncellendi=> "+ category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori hibernate ile veritabanı silindi=> "+ category.getCategoryName());
		
	}

}
