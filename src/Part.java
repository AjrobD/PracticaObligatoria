import java.util.ArrayList;

public class Part {
    String nombre;
    ArrayList<String> variables;
    ArrayList<Sentencia> restPart;

    public Part(String nombre, ArrayList<String> variables, ArrayList<Sentencia> restPart) {
        this.nombre = nombre;
        this.variables = variables;
        this.restPart = restPart;
    }
}
