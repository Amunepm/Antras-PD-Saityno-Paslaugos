package lt.viko.eif.pmaciulevicius.Antras_PD;

import lt.viko.eif.pmaciulevicius.Antras_PD.model.Ingredient;
import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IngredientTest {

    @Test
    void shouldSetAndGetIngredientFieldsCorrectly() {
        Ingredient ingredient = new Ingredient();
        ingredient.setId(1L);
        ingredient.setName("Milk");
        ingredient.setQuantity(1);
        ingredient.setPrice(1.20);
        ingredient.setAvailable(true);
        ingredient.setUnitCode('L');

        Recipe recipe = new Recipe();
        recipe.setName("Pancakes");
        ingredient.setRecipe(recipe);

        Assertions.assertEquals(1L, ingredient.getId());
        Assertions.assertEquals("Milk", ingredient.getName());
        Assertions.assertEquals(1, ingredient.getQuantity());
        Assertions.assertEquals(1.20, ingredient.getPrice(), 0.01);
        Assertions.assertTrue(ingredient.isAvailable());
        Assertions.assertEquals('L', ingredient.getUnitCode());
        Assertions.assertNotNull(ingredient.getRecipe());
        Assertions.assertEquals("Pancakes", ingredient.getRecipe().getName());
    }
}
