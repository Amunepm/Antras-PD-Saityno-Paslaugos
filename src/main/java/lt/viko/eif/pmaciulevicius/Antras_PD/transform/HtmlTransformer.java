package lt.viko.eif.pmaciulevicius.Antras_PD.transform;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class HtmlTransformer {

    public void transformXmlToHtml(String xmlPath, String xslPath, String outputPath) throws Exception {
        TransformerFactory factory = TransformerFactory.newInstance();

        Source xmlSource = new StreamSource(new File(xmlPath));
        Source xslSource = new StreamSource(new File(xslPath));

        Transformer transformer = factory.newTransformer(xslSource);
        Result result = new StreamResult(new File(outputPath));

        transformer.transform(xmlSource, result);
    }
}
