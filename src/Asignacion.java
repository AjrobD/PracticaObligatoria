import java.util.ArrayList;

public class Asignacion extends Sentencia {
    String identificador;
    String asig;
    ArrayList<Varios> resto;

    public Asignacion(String identificador, String asig, ArrayList<Varios> resto) {
        this.identificador = identificador;
        this.asig = asig;
        this.resto = resto;
    }

    @Override
    public String toString() {
        String sentencia = "";
        sentencia += "<DIV style='text-indent: 0.5cm'><SPAN CLASS='ident'>";
        sentencia += this.identificador;
        sentencia += "</SPAN> ";
        sentencia += this.asig+" ";

        int contador = 0;
        for(Varios vario : resto){
            contador++;
            sentencia += vario.toString();
            if(contador<resto.size()){
                sentencia+=" ";
            }
        }

        sentencia += ";</DIV>";
        return sentencia;
    }
}
