/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaedad;

/**
 *
 * @author alvaro
 */
import java.io.*;
public class CalculaEdad {

    /**
     * @param args the command line arguments
     */
    int anio;

    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            int anio = Integer.parseInt(pedirNumero());
            java.util.Date fecha = new Date();
            System.out.println (fecha);
            
        }catch(Exception ex){
            
        }
    }
    
    //Funcion que pide un numero al usuario
    public static String pedirNumero()throws IOException {
        BufferedReader sb = new BufferedReader (
        new InputStreamReader(System.in));
        String cadena=sb.readLine();
        return cadena;
    }
    
}
