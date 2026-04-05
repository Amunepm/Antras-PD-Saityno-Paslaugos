package lt.viko.eif.pmaciulevicius.Antras_PD.transform;

public class TransformationRunner {

    public static void main(String[] args) {
        HtmlTransformer htmlTransformer = new HtmlTransformer();
        PdfTransformer pdfTransformer = new PdfTransformer();

        String xmlPath = "src/main/resources/data/recipes.xml";
        String htmlXslPath = "src/main/resources/xsl/recipe-to-html.xsl";
        String pdfXslPath = "src/main/resources/xsl/recipe-to-pdf.xsl";
        String htmlOutputPath = "src/main/resources/output/recipe.html";
        String pdfOutputPath = "src/main/resources/output/recipe.pdf";

        try {
            htmlTransformer.transformXmlToHtml(xmlPath, htmlXslPath, htmlOutputPath);
            pdfTransformer.transformXmlToPdf(xmlPath, pdfXslPath, pdfOutputPath);

            System.out.println("Transformacija sėkminga.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
