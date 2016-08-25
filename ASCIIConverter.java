import java.util.Arrays;

/**
 * Esta clase es para covertir caracteres ASCII en una caraecte normal
 * y concatenarlos en una cadena
 *
 * @author: DIEGO FERNANDO CARDODOZO
 * @version: 1.0
 *
 */
 
public class ASCIIConverter {
       
       /**
     * El Metodo convierte un grupo de caracteres en string ASCII en cadena
     * @return cadena decodififada
     */
       
    public static String StringsASCII(String[] ASCII){
        
        String cadena = "";
        
        for (String ASCII1 : ASCII) {
            if(ASCII1 != null){
               cadena = cadena + String.valueOf(Character.toChars(Integer.parseInt(ASCII1))); 
            }           
        }
        
        return cadena;             
    }
    
    //Fin del metodo

    /**
     * El Metodo convierte un grupo de caracteres ASCII en enteros en cadena
     * @return cadena decodififada
     */
    
    public static String IntASCCI(int[] ASCII){
        
        String cadena = "";
        
        for (int ASCII1 : ASCII) {
            cadena = cadena + String.valueOf(Character.toChars(ASCII1)); 
        
        }
        return cadena;
    }
    
    //Fin del metodo

    /**
     * El Metodo convierte un grupo de caracteres ASCII en byte en cadena
     * @return cadena decodififada
     */
    
    public static String ByteASCCI(byte[] ASCII){

        
        String s = new String(ASCII);
        
        return s;  
    }
    
    //Fin del metodo
    
}
