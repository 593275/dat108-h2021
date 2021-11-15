package no.hvl.dat108.f25app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Person {
	
	@Id
	@NotNull
	@Pattern(regexp = "[A-ZÆØÅa-zæøå\\- ]*", message="...")
	private String navn;
	
	@NotNull
	@Email(message="...")
	private String epost;
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getEpost() {
		return epost;
	}
	public void setEpost(String epost) {
		this.epost = epost;
	}
	
	

}
