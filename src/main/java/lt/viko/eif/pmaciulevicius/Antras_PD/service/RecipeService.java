package lt.viko.eif.pmaciulevicius.Antras_PD.service;

import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import lt.viko.eif.pmaciulevicius.Antras_PD.repository.RecipeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Si klasė atsakinga už darbą su receptų duomenimis.
 */
@Service
public class RecipeService {

    /** Repozitorija, naudojama receptų gavimui iš duomenų bazės. */
    private final RecipeRepository recipeRepository;

    /**
     * Sukuria RecipeService objektą.
     *
     * @param recipeRepository repozitorija darbui su receptais
     */
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    /**
     * Grąžina pirmą rastą receptą iš duomenų bazės.
     *
     * @return pirmas rastas receptas
     */
    @Transactional(readOnly = true)
    public Recipe getFirstRecipe() {
        return recipeRepository.findAll().stream().findFirst().orElseThrow(() -> new RuntimeException("Recipe not found"));
    }
}
