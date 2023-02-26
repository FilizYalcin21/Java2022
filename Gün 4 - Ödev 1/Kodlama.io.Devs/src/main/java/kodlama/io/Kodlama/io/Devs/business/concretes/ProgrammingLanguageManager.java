package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository progLangRepo;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository progLangRepo) {
		this.progLangRepo = progLangRepo;
	}

	@Override
	public void add(ProgrammingLanguage progLang) throws Exception {
		/** Business Rules */
		// The name of the programming language cannot repeat.
		if (progLangRepo.getAll().contains(progLang)) {
			throw new Exception("The name of the programming language cannot repeat.");
		} else {
			progLangRepo.add(progLang);
		}
	}

	@Override
	public void delete(ProgrammingLanguage progLang) {
		progLangRepo.delete(progLang);
	}

	@Override
	public void update(ProgrammingLanguage progLang, ProgrammingLanguage newProgLang) throws Exception {
		/** Business Rules */
		// The name of the programming language cannot repeat.
		if (progLangRepo.getAll().contains(newProgLang)) {
			throw new Exception("The name of the programming language cannot repeat.");
		} else {
			progLangRepo.update(progLang, newProgLang);
		}
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return progLangRepo.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return progLangRepo.getById(id);
	}

}
