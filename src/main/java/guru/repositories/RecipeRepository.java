package guru.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
	
}
