import java.util.ArrayList;

public class Funcion extends Part{
    
    String tipo;
    
    public Funcion(String nombre, String tipo, ArrayList<Parametro> variables, ArrayList<Sentencia> restPart) {
        super(nombre, variables, restPart);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String getCabecera() {
        String cabecera = "";
        cabecera += tipo+" ";
        cabecera += nombre+" ";
        cabecera += "( ";
        int contador = 0;
        for(Parametro parametro : variables){
            contador++;
            cabecera += parametro.getTipo()+" ";
            cabecera += parametro.getNombre();
            if(contador< variables.size()) {
                cabecera += ", ";
            }
        }
        cabecera += ")</A></LI>";
        return cabecera;
    }

}
