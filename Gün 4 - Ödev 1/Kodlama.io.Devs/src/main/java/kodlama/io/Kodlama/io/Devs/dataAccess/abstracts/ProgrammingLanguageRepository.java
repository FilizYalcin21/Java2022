package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	void add(ProgrammingLanguage progLang);
	void delete(ProgrammingLanguage progLang);
	void update(ProgrammingLanguage progLang, ProgrammingLanguage newProgLang);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
}
