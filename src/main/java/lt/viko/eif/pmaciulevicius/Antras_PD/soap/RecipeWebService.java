package lt.viko.eif.pmaciulevicius.Antras_PD.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;

@WebService
public interface RecipeWebService {

    @WebMethod
    Recipe getRecipe();
}
