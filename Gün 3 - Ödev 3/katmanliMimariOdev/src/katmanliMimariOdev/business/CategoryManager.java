package katmanliMimariOdev.business;

import java.util.ArrayList;

import katmanliMimariOdev.core.logging.Logger;
import katmanliMimariOdev.dataAccess.CategoryDao;
import katmanliMimariOdev.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private ArrayList<Category> categoryList;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		/** Business rules start */
		
		// Category name cannot repeat
		/*
		for(int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).getName() == category.getName()) {
				throw new Exception("Bu kategori zaten mevcut.");
			}
		}
		*/
		
		/** Business rules end */
		
		categoryDao.add(category);
		// categoryList.add(category);
		
		// Logging
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
