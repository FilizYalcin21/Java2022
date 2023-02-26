package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public void add(ProgrammingLanguage progLang) {
		programmingLanguages.add(progLang);
	}

	@Override
	public void delete(ProgrammingLanguage progLang) {
		programmingLanguages.remove(progLang);
	}

	@Override
	public void update(ProgrammingLanguage progLang, ProgrammingLanguage newProgLang) {
		programmingLanguages.set(programmingLanguages.indexOf(progLang), newProgLang);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguages.get(id);
	}

}
