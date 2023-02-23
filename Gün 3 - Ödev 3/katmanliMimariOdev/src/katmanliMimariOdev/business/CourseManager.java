package katmanliMimariOdev.business;

import java.util.ArrayList;

import katmanliMimariOdev.core.logging.Logger;
import katmanliMimariOdev.dataAccess.CourseDao;
import katmanliMimariOdev.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<Course> courseList;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		/** Business rules start */
		
		// Course name cannot repeat
		/*
		for(int i = 0; i < courseList.size(); i++) {
			if(courseList.get(i).getName() == course.getName()) {
				throw new Exception("Bu kurs zaten mevcut.");
			}
		}
		*/
		
		// Course price cannot be less than 0
		if(course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
		
		/** Business rules end */
		
		courseDao.add(course);
		// courseList.add(course);
		
		// Logging
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
}
