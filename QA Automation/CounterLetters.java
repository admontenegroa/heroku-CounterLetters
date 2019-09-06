/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longitud_palabra;

/**
 *
 * @author Omar Jose Castro Castro
 */
public class Longitud_palabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //System.out.println(LongitudPalabra("hola mundo"));
         //System.out.println(LongitudPalabraTest());
        // TODO code application logic here
    }
    
    public static int LongitudPalabra(String palabra){
        String cadena=palabra;
        if (cadena.length()>20) {cadena=cadena.substring(0, 20);};
        return cadena.length();
    }
        
    //Escenario de prueba: Validar funcionalidad de longitud de strings en numeros
    public static String LongitudPalabraTest(){
        //Caso de prueba 1:
        //En ese escenario de prueba concreto sería ideal probarlo con palabras de 0, 1, 2, 18, 19, 20, 21, 22. Que son valores límites donde puede que el código se estalle
        String resultado="";
        String[] cadena = {"","a", "el","impresionantemente","semicircunferencias","electroencefalograma","constitucionalización"}; 
        resultado = resultado + "La longitud esperada de nunguna palabra es 0, al invocar la funcion el resultado fué :"+LongitudPalabra(cadena[0])+", ";
        resultado = resultado + "La longitud esperada de la palabra 'a' es 1, al invocar la funcion el resultado fué :"+LongitudPalabra(cadena[1])+", ";
        resultado = resultado + "La longitud esperada de la palabra 'el' es 2, al invocar la funcion el resultado fué :"+LongitudPalabra(cadena[2])+", ";
        resultado = resultado + "La longitud esperada de la palabra 'impresionantemente' es 18, al invocar la funcion el resultado fué :"+LongitudPalabra(cadena[3])+", ";
        resultado = resultado + "La longitud esperada de la palabra 'semicircunferencias' es 19, al invocar la funcion el resultado fué :"+LongitudPalabra(cadena[4])+", ";
        resultado = resultado + "La longitud esperada de la palabra 'electroencefalograma' es 20, al invocar la funcion el resultado fué :"+LongitudPalabra(cadena[5])+", ";
        resultado = resultado + "La longitud esperada de la palabra 'constitucionalización' es 21, al invocar la funcion el resultado fué :"+LongitudPalabra(cadena[6])+" ya que la heramienta tiene una longitud limite de 20 caracteres por lo cual recorta palabras mas largas. ";
        return resultado;
    }
        
}
