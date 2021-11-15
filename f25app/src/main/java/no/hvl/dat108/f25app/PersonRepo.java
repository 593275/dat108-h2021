package no.hvl.dat108.f25app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, String> {
	List<Person> findByEpost(String epost);
}
