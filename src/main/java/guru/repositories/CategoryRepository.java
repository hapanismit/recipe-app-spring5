package guru.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
