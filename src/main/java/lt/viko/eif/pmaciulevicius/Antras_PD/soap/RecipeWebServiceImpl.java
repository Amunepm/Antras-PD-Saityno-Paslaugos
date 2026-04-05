package lt.viko.eif.pmaciulevicius.Antras_PD.soap;

import jakarta.jws.WebService;
import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import lt.viko.eif.pmaciulevicius.Antras_PD.service.RecipeService;
import org.springframework.stereotype.Service;

@Service
@WebService(endpointInterface = "lt.viko.eif.pmaciulevicius.Antras_PD.soap.RecipeWebService")
public class RecipeWebServiceImpl implements RecipeWebService {

    private final RecipeService recipeService;

    public RecipeWebServiceImpl(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Override
    public Recipe getRecipe() {
        return recipeService.getFirstRecipe();
    }
}
