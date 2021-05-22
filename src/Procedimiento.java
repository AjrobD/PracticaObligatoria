import java.util.ArrayList;

public class Procedimiento extends Part{
    public Procedimiento(String nombre, ArrayList<Parametro> variables, ArrayList<Sentencia> restPart) {
        super(nombre, variables, restPart);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String getCabecera() {
        String cabecera = "";
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
