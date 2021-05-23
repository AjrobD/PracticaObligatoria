import java.util.ArrayList;

public abstract class Part {
    String nombre;
    ArrayList<Parametro> variables;
    ArrayList<Sentencia> sentencias;

    public Part(String nombre, ArrayList<Parametro> variables, ArrayList<Sentencia> sentencias) {
        this.nombre = nombre;
        this.variables = variables;
        this.sentencias = sentencias;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public abstract String toString();
    public abstract String getCabecera();
    public abstract String getTipo();
}
