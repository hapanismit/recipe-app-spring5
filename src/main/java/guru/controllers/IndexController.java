package guru.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.model.Category;
import guru.model.UnitOfMeasure;
import guru.repositories.CategoryRepository;
import guru.repositories.UnitOfMeasureRepository;

@Controller

public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}



	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Id of category : "+ categoryOptional.get().getId());
		System.out.println("Id of UOM : "+ unitOfMeasureOptional.get().getId());
		
		return "index";
	}
}
