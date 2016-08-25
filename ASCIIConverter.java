import java.util.Arrays;

/**
 *
 * @author USUARIO 6
 */
public class ASCIIConverter {
       
    public static String StringsASCII(String[] ASCII){
        
        String cadena = "";
        
        for (String ASCII1 : ASCII) {
            if(ASCII1 != null){
               cadena = cadena + String.valueOf(Character.toChars(Integer.parseInt(ASCII1))); 
            }           
        }
        
        return cadena;             
    }
    
    public static String IntASCCI(int[] ASCII){
        
        String cadena = "";
        
        for (int ASCII1 : ASCII) {
            cadena = cadena + String.valueOf(Character.toChars(ASCII1)); 
        
        }
        return cadena;
    }
    
    public static String ByteASCCI(byte[] ASCII){

        
        String s = new String(ASCII);
        
        return s;  
    }
    
}
