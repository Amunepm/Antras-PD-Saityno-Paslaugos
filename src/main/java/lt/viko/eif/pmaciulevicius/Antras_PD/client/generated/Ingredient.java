
package lt.viko.eif.pmaciulevicius.Antras_PD.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingredient complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ingredient">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingredient", propOrder = {
    "available",
    "name",
    "price",
    "quantity",
    "unitCode"
})
public class Ingredient {

    protected boolean available;
    protected String name;
    protected double price;
    protected int quantity;
    @XmlSchemaType(name = "unsignedShort")
    protected int unitCode;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
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
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     */
    public int getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     */
    public void setUnitCode(int value) {
        this.unitCode = value;
    }

}
