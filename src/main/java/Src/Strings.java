package Src;

import java.io.File;
import javax.xml.parsers.*;
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
            }
        }
        
        return texto;
    }
    
    
}
