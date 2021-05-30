import java.util.ArrayList;

public class BuclePara extends Sentencia{
    private String id1;
    private String asig1;
    ArrayList<Varios> exp1;
    private String listaConds;
    private String id2;
    private String asig2;
    ArrayList<Varios> exp2;
    private ArrayList<Sentencia> blq;

    public BuclePara(String id1, String asig1, ArrayList<Varios> exp1, String listaConds, String id2, String asig2, ArrayList<Varios> exp2, ArrayList<Sentencia> blq) {
        this.id1 = id1;
        this.asig1 = asig1;
        this.exp1 = exp1;
        this.listaConds = listaConds;
        this.id2 = id2;
        this.asig2 = asig2;
        this.exp2 = exp2;
        this.blq = blq;
    }

    @Override
    public String toString() {
        String parte="";
        parte += "<SPAN CLASS='palres'>";
        parte += "buclepara";
        parte += "</SPAN> (";
        //parte += "<A HREF='#"+id1+"'>"+id1+"</A>";
        parte += "<SPAN CLASS='ident'>"+id1+"</SPAN>";
        parte += asig1;
        int contador = 0;
        for(Varios vario : exp1){
            contador++;
            parte += vario.toString();
            if(contador< exp1.size()){
                parte+=" ";
            }
        }

        parte+="; ";
        parte+=listaConds+"; ";

        //parte += "<A HREF='#"+id2+"'>"+id2+"</A>";
        parte += "<SPAN CLASS='ident'>"+id2+"</SPAN>";
        parte += asig2;
        contador = 0;
        for(Varios vario : exp2){
            contador++;
            parte += vario.toString();
            if(contador< exp2.size()){
                parte+=" ";
            }
        }

        parte+=")";
        parte+="</br>";
        parte += "<SPAN CLASS='palres'>inicio</SPAN><BR/>";

        for(Sentencia sentencia: blq){
            parte += sentencia.toString();
        }

        parte += "<SPAN CLASS='palres'>fin</SPAN><BR/>";
        return parte;
    }
}
