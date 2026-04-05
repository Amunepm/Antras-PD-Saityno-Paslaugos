package lt.viko.eif.pmaciulevicius.Antras_PD.transform;

import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PdfTransformer {

    public void transformXmlToPdf(String xmlPath, String xslPath, String outputPath) throws Exception {
        File xmlFile = new File(xmlPath);
        File xslFile = new File(xslPath);
        File pdfFile = new File(outputPath);

        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

        try (OutputStream outputStream = new FileOutputStream(pdfFile)) {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, outputStream);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(xslFile));

            Source source = new StreamSource(xmlFile);
            Result result = new SAXResult(fop.getDefaultHandler());

            transformer.transform(source, result);
        }
    }
}
