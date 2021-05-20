import java.util.ArrayList;

public class Funcion extends Part{
    
    String tipo;
    
    public Funcion(String nombre, String tipo, ArrayList<String> variables, ArrayList<Sentencia> restPart) {
        super(nombre, variables, restPart);
        this.tipo = tipo;
    }
}
