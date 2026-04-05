package lt.viko.eif.pmaciulevicius.Antras_PD;

import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import lt.viko.eif.pmaciulevicius.Antras_PD.repository.RecipeRepository;
import lt.viko.eif.pmaciulevicius.Antras_PD.service.RecipeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

public class RecipeServiceTest {

    @Test
    void shouldReturnFirstRecipeWhenRepositoryHasData() {
        RecipeRepository recipeRepository = Mockito.mock(RecipeRepository.class);
        RecipeService recipeService = new RecipeService(recipeRepository);

        Recipe recipe = new Recipe();
        recipe.setName("Pancakes");

        Mockito.when(recipeRepository.findAll()).thenReturn(List.of(recipe));

        Recipe result = recipeService.getFirstRecipe();

        Assertions.assertNotNull(result);
        Assertions.assertEquals("Pancakes", result.getName());
    }

    @Test
    void shouldThrowExceptionWhenRepositoryIsEmpty() {
        RecipeRepository recipeRepository = Mockito.mock(RecipeRepository.class);
        RecipeService recipeService = new RecipeService(recipeRepository);

        Mockito.when(recipeRepository.findAll()).thenReturn(Collections.emptyList());

        Assertions.assertThrows(RuntimeException.class, recipeService::getFirstRecipe);
    }
}
