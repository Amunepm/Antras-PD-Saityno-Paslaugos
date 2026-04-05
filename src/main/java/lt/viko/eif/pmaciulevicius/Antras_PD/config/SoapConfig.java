package lt.viko.eif.pmaciulevicius.Antras_PD.config;

import jakarta.xml.ws.Endpoint;
import lt.viko.eif.pmaciulevicius.Antras_PD.soap.RecipeWebServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfig {

    @Bean
    public Endpoint recipeEndpoint(RecipeWebServiceImpl recipeWebService) {
        return Endpoint.publish("http://localhost:8085/recipe", recipeWebService);
    }
}
