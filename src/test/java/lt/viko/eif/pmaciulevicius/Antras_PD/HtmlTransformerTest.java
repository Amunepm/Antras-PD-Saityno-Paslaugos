package lt.viko.eif.pmaciulevicius.Antras_PD;

import lt.viko.eif.pmaciulevicius.Antras_PD.transform.HtmlTransformer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class HtmlTransformerTest {

    @Test
    void shouldTransformXmlToHtml() throws Exception {
        HtmlTransformer htmlTransformer = new HtmlTransformer();

        String xmlPath = "src/main/resources/data/recipes.xml";
        String xslPath = "src/main/resources/xsl/recipe-to-html.xsl";
        String outputPath = "src/test/resources/test-recipe.html";

        htmlTransformer.transformXmlToHtml(xmlPath, xslPath, outputPath);

        File outputFile = new File(outputPath);

        Assertions.assertTrue(outputFile.exists());
        Assertions.assertTrue(outputFile.length() > 0);
    }
}
