
package bo.sigep.xml.utils;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author jheredia
 */
public class XmlValidate {

    public void validate(String xml, String xsd) throws SAXException, IOException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema;
        schema = factory.newSchema(XmlValidate.class.getResource(xsd));
        Validator validator = schema.newValidator();
        validator.validate(new StreamSource(new StringReader(xml)));

    }

    public ValidateResult validateFormated(String xml, String xsd) throws IOException, SAXException {
        ValidateResult resultado = new ValidateResult();
        try {
            this.validate(xml, xsd);
            resultado.setEstado("OK");
            return resultado;
        } catch (IOException e) {
            throw e;
        } catch (SAXParseException ex) {
            resultado.setEstado("ERROR");
            resultado.setLineaError(ex.getLineNumber());
            resultado.setColumnaError(ex.getColumnNumber());
            resultado.setMensajeError(ex.getMessage().substring(ex.getMessage().indexOf(":") + 2)); 
            return resultado;
        } catch (SAXException e) {
            throw e;
        }
    }
}
