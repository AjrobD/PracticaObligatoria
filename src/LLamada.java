import java.util.ArrayList;

public class LLamada extends Sentencia{
    String identificador;
    ArrayList<Varios> resto;

    public LLamada(String identificador, ArrayList<Varios> resto) {
        this.identificador = identificador;
        this.resto = resto;
    }

    @Override
    public String toString() {
        String sentencia = "";
        sentencia += "<DIV><SPAN CLASS='ident'>";
        sentencia += this.identificador;
        sentencia += "</SPAN> ";

        int contador = 0;
        for(Varios vario : resto){
            contador++;
            sentencia += vario.toString();
            if(contador< resto.size()){
                sentencia+=" ";
            }
        }

        sentencia += ";</DIV>";
        return sentencia;
    }
}
