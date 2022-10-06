package kodlamaNLayered.business;

import java.util.List;

import kodlamaNLayered.dataAccess.CategoryDao;
import kodlamaNLayered.entities.Category;
import kodlamaNLayered.core.loggers.Logger;
import kodlamaNLayered.core.valid.CategoryValidator;

public class CategoryManager {
	private List<Category> categories;
	private CategoryDao categoryDao;
	private Logger[] loggers;
	public CategoryManager(List<Category> categories, CategoryDao categoryDao, Logger[] loggers) {
		this.categories= categories;
		this.categoryDao =categoryDao;
		this.loggers=loggers;
	}
	public void add(Category category) throws Exception {
        CategoryValidator.isCategoryNameUnique(categories,category);
        this.categories.add(category);
        this.categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }

    public void update(Category category) {
        this.categoryDao.update(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }

    public void delete(Category category) {
        this.categoryDao.delete(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
	

}
