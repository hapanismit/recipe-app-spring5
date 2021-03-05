package guru.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import guru.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	Optional<Category> findByDescription(String decription);
}
