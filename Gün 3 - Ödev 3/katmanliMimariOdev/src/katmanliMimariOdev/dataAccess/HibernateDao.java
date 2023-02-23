package katmanliMimariOdev.dataAccess;

import katmanliMimariOdev.entities.Category;
import katmanliMimariOdev.entities.Course;
import katmanliMimariOdev.entities.Educator;

public class HibernateDao implements CategoryDao, CourseDao, EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Eğitimci '" + educator.getName() + "' Hibernate ile eklendi.");
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs '" + course.getName() + "' Hibernate ile eklendi.");
	}

	@Override
	public void add(Category category) {
		System.out.println("Kategori '" + category.getName() + "' Hibernate ile eklendi.");
	}
	
}
