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
        return null;
    }
}
