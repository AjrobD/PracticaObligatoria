import java.util.ArrayList;

public class Bifurcacion extends Sentencia{
    private String listaCond;
    private ArrayList<Sentencia> blq1;
    private ArrayList<Sentencia> blq2;

    public Bifurcacion(String listaCond, ArrayList<Sentencia> blq1, ArrayList<Sentencia> blq2) {
        this.listaCond = listaCond;
        this.blq1 = blq1;
        this.blq2 = blq2;
    }

    @Override
    public String toString() {
        String parte="";
        parte += "<SPAN CLASS='palres'>";
        parte += "bifurcacion";
        parte += "</SPAN> (";
        parte+= listaCond+" )</br>";
        parte += "<SPAN CLASS='palres'>entonces</SPAN><BR/>";
        parte += "<SPAN CLASS='palres'>inicio</SPAN><BR/>";
        for(Sentencia sentencia: blq1){
            parte += sentencia.toString();
        }
        parte += "<SPAN CLASS='palres'>fin</SPAN><BR/>";
        parte += "<SPAN CLASS='palres'>sino</SPAN><BR/>";
        parte += "<SPAN CLASS='palres'>inicio</SPAN><BR/>";
        for(Sentencia sentencia: blq2){
            parte += sentencia.toString();
        }
        parte += "<SPAN CLASS='palres'>fin</SPAN><BR/>";
        return parte;
    }
}
