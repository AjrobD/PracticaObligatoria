import java.util.ArrayList;

public class Blq {
    ArrayList<Sentencia> sentencias;
    private int indent;

    public Blq(ArrayList<Sentencia> sentencias, int indent) {
        this.sentencias = sentencias;
        this.indent = indent;
    }

    @Override
    public String toString() {
        String bloque = "";
        bloque += "<DIV style='text-indent: "+indent*0.5+"cm'>";
        for(Sentencia sentencia : sentencias){
            bloque += sentencia.toString();
        }
        bloque += "</DIV>";
        return bloque;
    }
}
