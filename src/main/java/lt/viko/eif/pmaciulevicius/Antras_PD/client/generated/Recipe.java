
package lt.viko.eif.pmaciulevicius.Antras_PD.client.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recipe complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="recipe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="calories" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="difficulty" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         <element name="ingredients" type="{http://soap.Antras_PD.pmaciulevicius.eif.viko.lt/}ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prepTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="vegetarian" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipe", propOrder = {
    "calories",
    "difficulty",
    "ingredients",
    "name",
    "prepTime",
    "vegetarian"
})
public class Recipe {

    protected float calories;
    @XmlSchemaType(name = "unsignedShort")
    protected int difficulty;
    @XmlElement(nillable = true)
    protected List<Ingredient> ingredients;
    protected String name;
    protected int prepTime;
    protected boolean vegetarian;

    /**
     * Gets the value of the calories property.
     * 
     */
    public float getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     * 
     */
    public void setCalories(float value) {
        this.calories = value;
    }

    /**
     * Gets the value of the difficulty property.
     * 
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the value of the difficulty property.
     * 
     */
    public void setDifficulty(int value) {
        this.difficulty = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredients property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ingredient }
     * </p>
     * 
     * 
     * @return
     *     The value of the ingredients property.
     */
    public List<Ingredient> getIngredients() {
        if (ingredients == null) {
            ingredients = new ArrayList<>();
        }
        return this.ingredients;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the prepTime property.
     * 
     */
    public int getPrepTime() {
        return prepTime;
    }

    /**
     * Sets the value of the prepTime property.
     * 
     */
    public void setPrepTime(int value) {
        this.prepTime = value;
    }

    /**
     * Gets the value of the vegetarian property.
     * 
     */
    public boolean isVegetarian() {
        return vegetarian;
    }

    /**
     * Sets the value of the vegetarian property.
     * 
     */
    public void setVegetarian(boolean value) {
        this.vegetarian = value;
    }

}
