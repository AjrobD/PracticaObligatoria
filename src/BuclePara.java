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
        //Imprimir primero la palabra
        return null;
    }
}
