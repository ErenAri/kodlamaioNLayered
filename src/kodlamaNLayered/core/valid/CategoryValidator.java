package kodlamaNLayered.core.valid;

import java.util.Iterator;
import java.util.List;

import kodlamaNLayered.entities.Category;


public class CategoryValidator {
	
	public static void isCategoryNameUnique(List<Category> categories, Category category)throws Exception {
		for(Category c: categories) {
			if (c.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi mevcut yeni bir isim deneyin!");
			}
		}
	}
	

}
