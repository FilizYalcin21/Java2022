package katmanliMimariOdev.dataAccess;

import katmanliMimariOdev.entities.Category;
import katmanliMimariOdev.entities.Course;
import katmanliMimariOdev.entities.Educator;

public class JdbcDao implements CategoryDao, CourseDao, EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Eğitimci '" + educator.getName() + "' JDBC ile eklendi.");
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs '" + course.getName() + "' JDBC ile eklendi.");
	}

	@Override
	public void add(Category category) {
		System.out.println("Kategori '" + category.getName() + "' JDBC ile eklendi.");
	}

}
