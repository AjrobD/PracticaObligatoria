import java.util.ArrayList;

public class Return extends Sentencia {
    ArrayList<Varios> expresion;

    public Return(ArrayList<Varios> expresion) {
        this.expresion = expresion;
    }

    //<DIV style="text-indent: 0.5cm"><SPAN CLASS="palres">return</SPAN> <SPAN CLASS="ident">resultado</SPAN>;</DIV>
    @Override
    public String toString() {
        String sentencia = "";
        sentencia += "<DIV style='text-indent: 0.5cm'><SPAN CLASS='palres'>";
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
