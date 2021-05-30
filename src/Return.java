import java.util.ArrayList;

public class Return extends Sentencia {
    ArrayList<Varios> expresion;

    public Return(ArrayList<Varios> expresion) {
        this.expresion = expresion;
    }

    @Override
    public String toString() {
        String sentencia = "";
        sentencia += "<DIV><SPAN CLASS='palres'>";
        sentencia += "return";
        sentencia += "</SPAN> ";
        int contador = 0;
        for(Varios vario : expresion){
            contador++;
            sentencia += vario.toString();
            if(contador< expresion.size()){
                sentencia+=" ";
            }
        }

        sentencia += ";</DIV>";
        return sentencia;
    }
}
