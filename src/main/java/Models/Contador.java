package Models;

public class Contador {
	private String cadena;

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public int countLetter() {
		return this.getCadena().length();
	}
	
	public boolean isLengthOkey() {
		return this.getCadena().length() > 0 && this.getCadena().length()<=20;
	}

	public Contador(String cadena) {
		super();
		this.cadena = cadena;
	}
	
	public String writeNumber(int numero){
        
        int decimas,unidad;
        String Numero_txt="";
        unidad=numero%10;
        decimas=(numero-unidad)/10;
      
                switch(unidad){
                  case 1:Numero_txt=Numero_txt + "uno";
                  break;
                  case 2:Numero_txt=Numero_txt + "dos";
                  break;
                  case 3:Numero_txt=Numero_txt + "tres";
                  break;
                  case 4:Numero_txt=Numero_txt + "cuatro";
                  break;
                  case 5:Numero_txt=Numero_txt + "cinco";
                  break;
                  case 6:Numero_txt=Numero_txt + "seis";
                  break;
                  case 7:Numero_txt=Numero_txt + "siete";
                  break;
                  case 8:Numero_txt=Numero_txt + "ocho";
                  break;
                  case 9:Numero_txt=Numero_txt + "nueve";
                  break;
                }
             
                switch(decimas){
                    case 1:
                        switch(unidad){
                        case 0:Numero_txt="Diez";
                        break;
                        case 1:Numero_txt="Once";
                        break;
                        case 2:Numero_txt="Doce";
                        break;
                        case 3:Numero_txt="Trece";
                        break;
                        case 4:Numero_txt= "Catorce";
                        break;
                        case 5:Numero_txt="Quince";
                        break;
                        case 6:Numero_txt="Dieci"+Numero_txt;
                        break;
                        case 7:Numero_txt="Dieci"+Numero_txt;
                        break;
                        case 8:Numero_txt="Dieci"+Numero_txt;
                        break;
                        case 9:Numero_txt="Dieci"+Numero_txt;
                        break;

                        }
                    break;
                    case 2:Numero_txt="Veinte";
        }
                return Numero_txt;
    }

}
