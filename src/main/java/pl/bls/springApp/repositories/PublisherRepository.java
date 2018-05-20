package pl.bls.springApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.bls.springApp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
