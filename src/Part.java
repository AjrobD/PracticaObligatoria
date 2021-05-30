import java.util.ArrayList;

public abstract class Part {
    String nombre;
    ArrayList<Parametro> variables;
    Blq bloque;

    public Part(String nombre, ArrayList<Parametro> variables, Blq bloque) {
        this.nombre = nombre;
        this.variables = variables;
        this.bloque = bloque;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public abstract String toString();
    public abstract String getCabecera();
    public abstract String getTipo();
}
