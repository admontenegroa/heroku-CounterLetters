/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasis
 */

class  Palabra1{
   int longitud = 20; /*definición de la lognitud de la palabra*/
    
    public Palabra1(String miPalabra){ /* el constructor lee la palabra que va a medir*/
        
        if (VerificarLongitud(miPalabra) == 1){ /* Estos ses simplemente para probarlo*/
            System.out.println("longitud OK");
         } else {
            System.out.println("longitud NO");
        }
    }
    
    private int VerificarLongitud(String miP){ /*Este metodo  es el que querifica la longitud*/
        
        if (miP.length() < longitud){ /* verifica si la longitud de la palabra es menor que el parametro longitud*/
            return 1;  /*Si es menor retorna 1 */
         } else { 
            return 0; /*Si NO retorna 0 */
        }
    }
    
    
}

public class probar{   /*Este es un programita simplemente para probar el funcionamiento*/
    /**
     *
     * @param arg
     */
    public static void main( String []arg)
    {
        String str = "Esta es una cadena";
        Palabra1 pala = new Palabra1(str);
        int longitud1 = str.length();
        System.out.println(longitud1);
       
    }
}


