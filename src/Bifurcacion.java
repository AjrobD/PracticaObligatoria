import java.util.ArrayList;

public class Bifurcacion extends Sentencia{
    private String listaCond;
    private Blq bloque1;
    private Blq bloque2;

    public Bifurcacion(String listaCond, Blq bloque1, Blq bloque2) {
        this.listaCond = listaCond;
        this.bloque1 = bloque1;
        this.bloque2 = bloque2;
    }

    @Override
    public String toString() {
        String parte="";
        parte += "<DIV><SPAN CLASS='palres'>";
        parte += "bifurcacion";
        parte += "</SPAN> (";
        parte += listaCond+" )</DIV>";
        parte += "<DIV><SPAN CLASS='palres'>entonces</SPAN></DIV>";
        parte += "<DIV><SPAN CLASS='palres'>inicio</SPAN></DIV>";
        parte += bloque1;
        parte += "<DIV><SPAN CLASS='palres'>fin</SPAN></DIV>";
        parte += "<DIV><SPAN CLASS='palres'>sino</SPAN></DIV>";
        parte += "<DIV><SPAN CLASS='palres'>inicio</SPAN></DIV>";
        parte += bloque2;
        parte += "<DIV><SPAN CLASS='palres'>fin</SPAN></DIV>";
        return parte;

    }
}
