package pl.bls.springApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.bls.springApp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
