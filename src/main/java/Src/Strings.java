package Src;

import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;


public class Strings {
    
    private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    private org.w3c.dom.Document documento = null;
    private String direccionXml = "src/main/java/Src/Strings.xml";
    
    
    public Strings() {
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            documento = (org.w3c.dom.Document) builder.parse(new File(direccionXml));
            
            System.out.println("Archivo abierto con exito");
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }
    }
    
    public String getText(String nombreText){
        String texto = null;
        NodeList listaString = documento.getElementsByTagName("String");
        
        for (int i = 0; i < listaString.getLength(); i++) {
            Node nodoString = listaString.item(i);
            System.out.println(nodoString.getAttributes().getNamedItem("value"));
            if(nodoString.getAttributes().getNamedItem("value").getTextContent().equals(nombreText)){
                texto = nodoString.getTextContent();
                return texto;
            }
        }
        
        return null;
    }
    
    public void escribirXML(String nodo, String value) throws TransformerConfigurationException, TransformerException{
        
            
        NodeList listaString = documento.getElementsByTagName("String");
        for(int i = 0; i<listaString.getLength(); i++){
            
            Node nodoString = listaString.item(i);
            
            if(nodoString.getAttributes().getNamedItem("value").getTextContent().equals(nodo)){
                nodoString.setTextContent(value);
                break;
            }
        }
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(documento);
        StreamResult result = new StreamResult(new File("src/main/java/Src/Strings.xml"));
        transformer.transform(source, result);
        
    }
    
    
}
