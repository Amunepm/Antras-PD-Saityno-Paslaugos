package lt.viko.eif.pmaciulevicius.Antras_PD.config;

import jakarta.xml.ws.Endpoint;
import lt.viko.eif.pmaciulevicius.Antras_PD.soap.RecipeWebServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Si klasė skirta SOAP serviso konfigūracijai.
 * Ji publikuoja web servisą nurodytu adresu.
 */
@Configuration
public class SoapConfig {

    /**
     * Publikuoja receptų SOAP servisą.
     *
     * @param recipeWebService SOAP serviso implementacija
     * @return publikuotas endpoint objektas
     */
    @Bean
    public Endpoint recipeEndpoint(RecipeWebServiceImpl recipeWebService) {
        return Endpoint.publish("http://localhost:8085/recipe", recipeWebService);
    }
}
