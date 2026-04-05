package lt.viko.eif.pmaciulevicius.Antras_PD.client;

import lt.viko.eif.pmaciulevicius.Antras_PD.client.generated.Recipe;
import lt.viko.eif.pmaciulevicius.Antras_PD.client.generated.RecipeWebService;
import lt.viko.eif.pmaciulevicius.Antras_PD.client.generated.RecipeWebServiceImplService;

/**
 * Si klasė skirta SOAP kliento paleidimui.
 * Ji kreipiasi į web servisą ir išspausdina gautą recepto informaciją.
 */
public class RecipeClientRunner {

    /**
     * Pagrindinis metodas kliento paleidimui.
     *
     * @param args programos argumentai
     */
    public static void main(String[] args) {
        RecipeWebServiceImplService service = new RecipeWebServiceImplService();
        RecipeWebService port = service.getRecipeWebServiceImplPort();

        Recipe recipe = port.getRecipe();

        System.out.println("Recipe name: " + recipe.getName());
        System.out.println("Preparation time: " + recipe.getPrepTime());
        System.out.println("Calories: " + recipe.getCalories());
        System.out.println("Vegetarian: " + recipe.isVegetarian());
        System.out.println("Difficulty: " + recipe.getDifficulty());

        if (recipe.getIngredients() != null) {
            recipe.getIngredients().forEach(ingredient ->
                    System.out.println("Ingredient: " + ingredient.getName()));
        }
    }
}
