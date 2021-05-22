import java.util.ArrayList;

public abstract class Part {
    String nombre;
    ArrayList<Parametro> variables;
    ArrayList<Sentencia> restPart;

    public Part(String nombre, ArrayList<Parametro> variables, ArrayList<Sentencia> restPart) {
        this.nombre = nombre;
        this.variables = variables;
        this.restPart = restPart;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public abstract String toString();
    public abstract String getCabecera();
}
