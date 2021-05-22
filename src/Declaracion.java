import java.util.ArrayList;

public class Declaracion extends Sentencia {
    private String tipo;
    private ArrayList<String> identificadores;

    public Declaracion(String tipo, ArrayList<String> identificadores) {
        this.tipo = tipo;
        this.identificadores = identificadores;
    }
}
