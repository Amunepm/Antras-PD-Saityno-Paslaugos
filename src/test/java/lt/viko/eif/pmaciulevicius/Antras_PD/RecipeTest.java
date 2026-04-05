package lt.viko.eif.pmaciulevicius.Antras_PD;

import lt.viko.eif.pmaciulevicius.Antras_PD.model.Ingredient;
import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RecipeTest {

    @Test
    void shouldSetAndGetRecipeFieldsCorrectly() {
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        recipe.setName("Pancakes");
        recipe.setPrepTime(20);
        recipe.setCalories(320.5f);
        recipe.setVegetarian(false);
        recipe.setDifficulty('E');

        Ingredient ingredient = new Ingredient();
        ingredient.setName("Flour");

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient);

        recipe.setIngredients(ingredients);

        Assertions.assertEquals(1L, recipe.getId());
        Assertions.assertEquals("Pancakes", recipe.getName());
        Assertions.assertEquals(20, recipe.getPrepTime());
        Assertions.assertEquals(320.5f, recipe.getCalories());
        Assertions.assertFalse(recipe.isVegetarian());
        Assertions.assertEquals('E', recipe.getDifficulty());
        Assertions.assertNotNull(recipe.getIngredients());
        Assertions.assertEquals(1, recipe.getIngredients().size());
        Assertions.assertEquals("Flour", recipe.getIngredients().get(0).getName());
    }
}
