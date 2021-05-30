import java.util.ArrayList;

public class Declaracion extends Sentencia {
    private String tipo;
    private ArrayList<Varios> identificadores;

    public Declaracion(String tipo, ArrayList<Varios> identificadores) {
        this.tipo = tipo;
        this.identificadores = identificadores;
    }

    @Override
    public String toString() {
        String sentencia = "";
        sentencia += "<DIV><SPAN CLASS='palres'>";
        sentencia += this.tipo;
        sentencia += "</SPAN> ";
        int contador = 0;
        for(Varios identificador : identificadores) {
            contador++;
            sentencia += identificador.toString();
            if(contador < identificadores.size()){
                sentencia += ", ";
            }
        }
        sentencia += ";</DIV>";
        return sentencia;
    }
}
