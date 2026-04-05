package lt.viko.eif.pmaciulevicius.Antras_PD.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

/**
 * Si klasė aprašo recepto objektą.
 * Joje saugoma pagrindinė informacija apie receptą ir jo ingredientus.
 */
@XmlRootElement(name = "recipe")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "recipes")
public class Recipe {

    /** Recepto identifikatorius duomenų bazėje. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Recepto pavadinimas. */
    private String name;

    /** Paruošimo laikas minutėmis. */
    private int prepTime;

    /** Kalorijų kiekis. */
    private float calories;

    /** Nurodo, ar receptas yra vegetariškas. */
    private boolean vegetarian;

    /** Recepto sudėtingumo lygis. */
    private char difficulty;

    /** Receptui priskirtų ingredientų sąrašas. */
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ingredient> ingredients;

    /**
     * Tuščias konstruktorius.
     */
    public Recipe() {
    }

    /**
     * Grąžina recepto identifikatorių.
     *
     * @return recepto identifikatorius
     */
    public Long getId() {
        return id;
    }

    /**
     * Nustato recepto identifikatorių.
     *
     * @param id recepto identifikatorius
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Grąžina recepto pavadinimą.
     *
     * @return recepto pavadinimas
     */
    public String getName() {
        return name;
    }

    /**
     * Nustato recepto pavadinimą.
     *
     * @param name recepto pavadinimas
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Grąžina paruošimo laiką.
     *
     * @return paruošimo laikas minutėmis
     */
    public int getPrepTime() {
        return prepTime;
    }

    /**
     * Nustato paruošimo laiką.
     *
     * @param prepTime paruošimo laikas minutėmis
     */
    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    /**
     * Grąžina kalorijų kiekį.
     *
     * @return kalorijų kiekis
     */
    public float getCalories() {
        return calories;
    }

    /**
     * Nustato kalorijų kiekį.
     *
     * @param calories kalorijų kiekis
     */
    public void setCalories(float calories) {
        this.calories = calories;
    }

    /**
     * Patikrina, ar receptas yra vegetariškas.
     *
     * @return true jei receptas vegetariškas, false jei ne
     */
    public boolean isVegetarian() {
        return vegetarian;
    }

    /**
     * Nustato, ar receptas yra vegetariškas.
     *
     * @param vegetarian vegetariškumo reikšmė
     */
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    /**
     * Grąžina recepto sudėtingumą.
     *
     * @return sudėtingumo simbolis
     */
    public char getDifficulty() {
        return difficulty;
    }

    /**
     * Nustato recepto sudėtingumą.
     *
     * @param difficulty sudėtingumo simbolis
     */
    public void setDifficulty(char difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Grąžina recepto ingredientų sąrašą.
     *
     * @return ingredientų sąrašas
     */
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    /**
     * Nustato recepto ingredientų sąrašą.
     *
     * @param ingredients ingredientų sąrašas
     */
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
