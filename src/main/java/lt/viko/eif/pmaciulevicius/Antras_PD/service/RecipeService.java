package lt.viko.eif.pmaciulevicius.Antras_PD.service;

import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import lt.viko.eif.pmaciulevicius.Antras_PD.repository.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe getFirstRecipe() {
        return recipeRepository.findAll().stream().findFirst().orElseThrow(() -> new RuntimeException("Recipe not found"));
    }
}
