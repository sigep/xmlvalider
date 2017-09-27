package bo.sigep.xml.utils.test;

import bo.sigep.xml.utils.XmlFormatter;
import bo.sigep.xml.utils.XmlValidate;
import bo.sigep.xml.utils.ValidateResult;
import java.io.IOException;
import org.xml.sax.SAXException;

/**
 *
 * @author jheredia
 */
public class Main {

    public static String xml
            = "<course  >"
            + "<id>d</id>"
            + "<name>JAX-B</name>"
            + "<description>Validate XML against XSD Schema</description>"
            + "</course>";

    public static void main(String... args) throws IOException, SAXException {
        XmlFormatter xf = new XmlFormatter();
        XmlValidate xv = new XmlValidate();
        String nuevo = xf.formatXML(xml);
        ValidateResult vr = xv.validateFormated(nuevo, "/esquemita.xml");
        System.out.println(nuevo);
        System.out.println(vr.getEstado());
        System.out.println(vr.getColumnaError());
        System.out.println(vr.getLineaError());
        System.out.println(vr.getMensajeError());
    }
}
