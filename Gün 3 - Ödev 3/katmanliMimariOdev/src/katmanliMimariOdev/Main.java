package katmanliMimariOdev;

import katmanliMimariOdev.business.CategoryManager;
import katmanliMimariOdev.business.CourseManager;
import katmanliMimariOdev.business.EducatorManager;
import katmanliMimariOdev.core.logging.DatabaseLogger;
import katmanliMimariOdev.core.logging.FileLogger;
import katmanliMimariOdev.core.logging.Logger;
import katmanliMimariOdev.core.logging.MailLogger;
import katmanliMimariOdev.dataAccess.HibernateDao;
import katmanliMimariOdev.dataAccess.JdbcDao;
import katmanliMimariOdev.entities.Category;
import katmanliMimariOdev.entities.Course;
import katmanliMimariOdev.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		// Instantiating objects of entities
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Algoritma");
		Category category3 = new Category(3, "Programlama");
		
		Course course1 = new Course(1, "Java", 100);
		Course course2 = new Course(2, ".NET", 120);
		Course course3 = new Course(3, "Java", 110);
		
		Educator educator1 = new Educator(1, "Engin Demiroğ");
		
		
		// Instantiating Loggers
		Logger[] loggers = {new FileLogger(), new MailLogger(), new DatabaseLogger()};
		
		
		// Instantiating Managers
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);
		EducatorManager educatorManager = new EducatorManager(new HibernateDao(), loggers);
		
		
		// Test
		categoryManager.add(category1);
		System.out.println();
		categoryManager.add(category2);
		System.out.println();
		// categoryManager.add(category3);
		//System.out.println();
		courseManager.add(course1);
		System.out.println();
		courseManager.add(course2);
		System.out.println();
		// courseManager.add(course3);
		
		educatorManager.add(educator1);
		
	}

}
