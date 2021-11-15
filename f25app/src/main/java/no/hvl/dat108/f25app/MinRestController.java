package no.hvl.dat108.f25app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinRestController {
	
    @Autowired
    private PersonRepo repository;
    
    @GetMapping("/listeSomJson")
    public Iterable<Person> personliste(Model model) {
    	return repository.findAll();
    }
    

}
