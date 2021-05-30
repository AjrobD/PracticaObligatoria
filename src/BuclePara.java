import java.util.ArrayList;

public class BuclePara extends Sentencia{
    private Asignacion asig1;
    private String listaConds;
    private Asignacion asig2;
    private ArrayList<Sentencia> blq;

    public BuclePara(Asignacion asig1, String listaConds, Asignacion asig2, ArrayList<Sentencia> blq) {
        this.asig1 = asig1;
        this.listaConds = listaConds;
        this.asig2 = asig2;
        this.blq = blq;
    }

    @Override
    public String toString() {
        String parte="";
        parte += "<SPAN CLASS='palres'>";
        parte += "buclepara";
        parte += "</SPAN> (";
        parte += "<A HREF=#\""+this.asig1.identificador+"\"</A>";
        parte += this.asig1.asig+" ";
        int contador = 0;
        for(Varios vario : asig1.resto){
            contador++;
            parte+= vario.toString();
            if(contador<asig1.resto.size()){
                parte+=" ";
            }
        }
        parte+="; ";
        parte+=listaConds+";";
        parte += "</SPAN> (";
        parte += "<A HREF=#\""+this.asig2.identificador+"\"</A>";
        parte += this.asig2.asig+" ";
        int contador2 = 0;
        for(Varios vario2 : asig2.resto){
            contador2++;
            parte+= vario2.toString();
            if(contador2<asig2.resto.size()){
                parte+=" ";
            }
        }
        parte+="</br>";
        parte += "<SPAN CLASS='palres'>inicio</SPAN><BR/>";

        for(Sentencia sentencia: blq){
            parte += sentencia.toString();
        }
        parte += "<SPAN CLASS='palres'>fin</SPAN><BR/>";
        return parte;
    }
}
