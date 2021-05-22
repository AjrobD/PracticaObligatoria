import java.util.ArrayList;

public class Asignacion extends Sentencia {
    String identificador;
    ArrayList<String> resto;

    public Asignacion(String identificador, ArrayList<String> resto) {
        this.identificador = identificador;
        this.resto = resto;
    }
}
