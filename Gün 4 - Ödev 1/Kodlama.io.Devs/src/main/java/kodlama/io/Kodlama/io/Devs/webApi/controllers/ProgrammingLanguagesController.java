package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService progLangService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService progLangService) {
		this.progLangService = progLangService;
	}
	
	@GetMapping("/add")
	public void add(ProgrammingLanguage progLang) throws Exception {
		progLangService.add(progLang);
	}
	
	@GetMapping("/delete")
	public void delete(ProgrammingLanguage progLang) {
		progLangService.delete(progLang);
	}
	
	@GetMapping("/update")
	public void update(ProgrammingLanguage progLang, ProgrammingLanguage newProgLang) throws Exception {
		progLangService.update(progLang, newProgLang);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return progLangService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return progLangService.getById(id);
	}

}
