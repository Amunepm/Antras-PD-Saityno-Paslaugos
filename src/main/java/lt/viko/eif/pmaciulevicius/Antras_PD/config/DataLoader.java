package lt.viko.eif.pmaciulevicius.Antras_PD.config;

import lt.viko.eif.pmaciulevicius.Antras_PD.model.Ingredient;
import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import lt.viko.eif.pmaciulevicius.Antras_PD.repository.RecipeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Si klasė skirta pradiniams duomenims įkelti į duomenų bazę.
 * Paleidus programą, ji įrašo receptą ir jo ingredientus, jei lentelė dar tuščia.
 */
@Configuration
public class DataLoader {

    /**
     * Sukuria pradinį recepto įrašą duomenų bazėje.
     *
     * @param recipeRepository repozitorija darbui su receptais
     * @return CommandLineRunner objektas
     */
    @Bean
    public org.springframework.boot.CommandLineRunner loadData(RecipeRepository recipeRepository) {
        return args -> {
            if (recipeRepository.count() == 0) {
                Recipe recipe = new Recipe();
                recipe.setName("Pancakes");
                recipe.setPrepTime(20);
                recipe.setCalories(320.5f);
                recipe.setVegetarian(false);
                recipe.setDifficulty('E');

                Ingredient ingredient1 = new Ingredient();
                ingredient1.setName("Flour");
                ingredient1.setQuantity(200);
                ingredient1.setPrice(0.80);
                ingredient1.setAvailable(true);
                ingredient1.setUnitCode('G');
                ingredient1.setRecipe(recipe);

                Ingredient ingredient2 = new Ingredient();
                ingredient2.setName("Milk");
                ingredient2.setQuantity(1);
                ingredient2.setPrice(1.20);
                ingredient2.setAvailable(true);
                ingredient2.setUnitCode('L');
                ingredient2.setRecipe(recipe);

                List<Ingredient> ingredients = new ArrayList<>();
                ingredients.add(ingredient1);
                ingredients.add(ingredient2);

                recipe.setIngredients(ingredients);

                recipeRepository.save(recipe);
            }
        };
    }
}
