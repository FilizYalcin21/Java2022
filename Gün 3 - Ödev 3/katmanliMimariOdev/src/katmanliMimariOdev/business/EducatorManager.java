package katmanliMimariOdev.business;

import katmanliMimariOdev.core.logging.Logger;
import katmanliMimariOdev.dataAccess.EducatorDao;
import katmanliMimariOdev.entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] loggers;
	
	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}
	
	public void add(Educator educator) {
		/** Business rules */
		// Business rules will come here if necessary
		
		educatorDao.add(educator);
		
		// Logging
		for (Logger logger : loggers) {
			logger.log(educator.getName());
		}
	}
}
