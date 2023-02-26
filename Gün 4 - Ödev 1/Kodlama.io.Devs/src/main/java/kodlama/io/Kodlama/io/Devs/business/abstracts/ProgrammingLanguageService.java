package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	void add(ProgrammingLanguage progLang) throws Exception;
	void delete(ProgrammingLanguage progLang);
	void update(ProgrammingLanguage progLang, ProgrammingLanguage newProgLang) throws Exception;
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
}
