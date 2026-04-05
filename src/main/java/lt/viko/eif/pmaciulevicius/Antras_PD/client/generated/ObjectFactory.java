
package lt.viko.eif.pmaciulevicius.Antras_PD.client.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.pmaciulevicius.Antras_PD.client.generated package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetRecipe_QNAME = new QName("http://soap.Antras_PD.pmaciulevicius.eif.viko.lt/", "getRecipe");
    private static final QName _GetRecipeResponse_QNAME = new QName("http://soap.Antras_PD.pmaciulevicius.eif.viko.lt/", "getRecipeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.pmaciulevicius.Antras_PD.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRecipe }
     * 
     * @return
     *     the new instance of {@link GetRecipe }
     */
    public GetRecipe createGetRecipe() {
        return new GetRecipe();
    }

    /**
     * Create an instance of {@link GetRecipeResponse }
     * 
     * @return
     *     the new instance of {@link GetRecipeResponse }
     */
    public GetRecipeResponse createGetRecipeResponse() {
        return new GetRecipeResponse();
    }

    /**
     * Create an instance of {@link Recipe }
     * 
     * @return
     *     the new instance of {@link Recipe }
     */
    public Recipe createRecipe() {
        return new Recipe();
    }

    /**
     * Create an instance of {@link Ingredient }
     * 
     * @return
     *     the new instance of {@link Ingredient }
     */
    public Ingredient createIngredient() {
        return new Ingredient();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipe }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRecipe }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Antras_PD.pmaciulevicius.eif.viko.lt/", name = "getRecipe")
    public JAXBElement<GetRecipe> createGetRecipe(GetRecipe value) {
        return new JAXBElement<>(_GetRecipe_QNAME, GetRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRecipeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.Antras_PD.pmaciulevicius.eif.viko.lt/", name = "getRecipeResponse")
    public JAXBElement<GetRecipeResponse> createGetRecipeResponse(GetRecipeResponse value) {
        return new JAXBElement<>(_GetRecipeResponse_QNAME, GetRecipeResponse.class, null, value);
    }

}
