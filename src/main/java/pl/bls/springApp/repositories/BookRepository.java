package pl.bls.springApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.bls.springApp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
