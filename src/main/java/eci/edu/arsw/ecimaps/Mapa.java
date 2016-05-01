package eci.edu.arsw.ecimaps;

import eci.edu.arsw.services.Exportar;
import eci.edu.arsw.services.Importar;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * El mapa esta compuesta por un solo nodo central, y este puede tener una gran
 * cantidad de nojos hijos.
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Mapa implements Exportar, Importar {

    public static final String ELEMENT_XML = "Mapa";

    private final Nodo nodoCentral;

    public Mapa(Nodo nodo) {
        this.nodoCentral = nodo;
    }

    @Override
    public void exportarXML(String path) {
        try {
            //http://www.tutorialspoint.com/java_xml/java_dom_create_document.htm
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            // root element
            Element rootElement = doc.createElement(Mapa.ELEMENT_XML);
            doc.appendChild(rootElement);

            rootElement.appendChild(nodoCentral.toXML(doc));

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(path));
            transformer.transform(source, result);
            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);

        } catch (ParserConfigurationException | TransformerException ex) {
            Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void importarXML(String path) {

    }

    @Override
    public void exportarJSON(String path) {
    }

    @Override
    public void importatJSON(String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
