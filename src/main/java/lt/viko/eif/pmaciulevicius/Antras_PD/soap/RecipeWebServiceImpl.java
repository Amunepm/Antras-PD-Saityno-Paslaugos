package lt.viko.eif.pmaciulevicius.Antras_PD.soap;

import jakarta.jws.WebService;
import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import lt.viko.eif.pmaciulevicius.Antras_PD.service.RecipeService;
import org.springframework.stereotype.Service;

/**
 * Si klasė įgyvendina SOAP servisą, skirtą recepto duomenų gavimui.
 */
@Service
@WebService(endpointInterface = "lt.viko.eif.pmaciulevicius.Antras_PD.soap.RecipeWebService")
public class RecipeWebServiceImpl implements RecipeWebService {

    /** Serviso sluoksnis, naudojamas receptų gavimui iš duomenų bazės. */
    private final RecipeService recipeService;

    /**
     * Sukuria RecipeWebServiceImpl objektą.
     *
     * @param recipeService serviso sluoksnis darbui su receptais
     */
    public RecipeWebServiceImpl(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /**
     * Grąžina receptą iš duomenų bazės.
     *
     * @return recepto objektas
     */
    @Override
    public Recipe getRecipe() {
        return recipeService.getFirstRecipe();
    }
}
