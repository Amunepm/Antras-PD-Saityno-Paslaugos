package lt.viko.eif.pmaciulevicius.Antras_PD;

import lt.viko.eif.pmaciulevicius.Antras_PD.transform.PdfTransformer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class PdfTransformerTest {

    @Test
    void shouldTransformXmlToPdf() throws Exception {
        PdfTransformer pdfTransformer = new PdfTransformer();

        String xmlPath = "src/main/resources/data/recipes.xml";
        String xslPath = "src/main/resources/xsl/recipe-to-pdf.xsl";
        String outputPath = "src/test/resources/test-recipe.pdf";

        pdfTransformer.transformXmlToPdf(xmlPath, xslPath, outputPath);

        File outputFile = new File(outputPath);

        Assertions.assertTrue(outputFile.exists());
        Assertions.assertTrue(outputFile.length() > 0);
    }
}
