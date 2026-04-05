package lt.viko.eif.pmaciulevicius.Antras_PD.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;

/**
 * Si klasė aprašo ingrediento objektą.
 * Joje saugoma pagrindinė informacija apie ingredientą ir receptą, kuriam jis priklauso.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "ingredients")
public class Ingredient {

    /** Ingrediento identifikatorius duomenų bazėje. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Ingrediento pavadinimas. */
    private String name;

    /** Ingrediento kiekis. */
    private int quantity;

    /** Ingrediento kaina. */
    private double price;

    /** Nurodo, ar ingredientas yra prieinamas. */
    private boolean available;

    /** Matavimo vieneto kodas. */
    private char unitCode;

    /** Receptas, kuriam priklauso ingredientas. */
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    /**
     * Tuščias konstruktorius.
     */
    public Ingredient() {
    }

    /**
     * Grąžina ingrediento identifikatorių.
     *
     * @return ingrediento identifikatorius
     */
    public Long getId() {
        return id;
    }

    /**
     * Nustato ingrediento identifikatorių.
     *
     * @param id ingrediento identifikatorius
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Grąžina ingrediento pavadinimą.
     *
     * @return ingrediento pavadinimas
     */
    public String getName() {
        return name;
    }

    /**
     * Nustato ingrediento pavadinimą.
     *
     * @param name ingrediento pavadinimas
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Grąžina ingrediento kiekį.
     *
     * @return ingrediento kiekis
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Nustato ingrediento kiekį.
     *
     * @param quantity ingrediento kiekis
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Grąžina ingrediento kainą.
     *
     * @return ingrediento kaina
     */
    public double getPrice() {
        return price;
    }

    /**
     * Nustato ingrediento kainą.
     *
     * @param price ingrediento kaina
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Patikrina, ar ingredientas yra prieinamas.
     *
     * @return true jei ingredientas prieinamas, false jei ne
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Nustato ingrediento prieinamumą.
     *
     * @param available prieinamumo reikšmė
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Grąžina matavimo vieneto kodą.
     *
     * @return matavimo vieneto kodas
     */
    public char getUnitCode() {
        return unitCode;
    }

    /**
     * Nustato matavimo vieneto kodą.
     *
     * @param unitCode matavimo vieneto kodas
     */
    public void setUnitCode(char unitCode) {
        this.unitCode = unitCode;
    }

    /**
     * Grąžina receptą, kuriam priklauso ingredientas.
     *
     * @return receptas
     */
    public Recipe getRecipe() {
        return recipe;
    }

    /**
     * Nustato receptą, kuriam priklauso ingredientas.
     *
     * @param recipe receptas
     */
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
