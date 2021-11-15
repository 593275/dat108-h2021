package no.hvl.dat108.f25app;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SimpleController {
	
    @Autowired
    private PersonRepo repository;

    @GetMapping("/personfradb")
    public String personliste(Model model) {
    	Person person = repository.findByEpost("arne@gmail.com").get(0);
    	model.addAttribute("person", person);
        return "kvittering";
    }

    @PostMapping("/sendinn")
    public String sendInn(@Valid Person person, BindingResult binding, Model model) {
    	
    	if(binding.hasErrors() ) {
    		return "feilmelding";
    	}
    	
    	repository.save(person);
    	model.addAttribute("person", person);
        return "kvittering";
    }

//    @GetMapping("/kvittering")
//    public String kvittering() {
//        return "kvittering";
//    }

    @GetMapping("/skjema")
    public String hentSkjema() {
        return "skjema";
    }

    @GetMapping("/hallo")
    public String homePage(Model model) {
        model.addAttribute("melding", "Hallo på do!");
        return "hallo";
    }
}
