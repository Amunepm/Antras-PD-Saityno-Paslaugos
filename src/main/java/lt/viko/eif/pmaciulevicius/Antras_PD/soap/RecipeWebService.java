package lt.viko.eif.pmaciulevicius.Antras_PD.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;

/**
 * SOAP serviso sąsaja, skirta darbui su receptų duomenimis.
 */
@WebService
public interface RecipeWebService {

    /**
     * Grąžina recepto informaciją.
     *
     * @return recepto objektas
     */
    @WebMethod
    Recipe getRecipe();
}
