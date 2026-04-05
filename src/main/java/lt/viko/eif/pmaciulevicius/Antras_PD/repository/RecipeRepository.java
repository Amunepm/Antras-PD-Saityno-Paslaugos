package lt.viko.eif.pmaciulevicius.Antras_PD.repository;

import lt.viko.eif.pmaciulevicius.Antras_PD.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
