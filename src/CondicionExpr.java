import java.util.ArrayList;

public class CondicionExpr extends Condicion {
    ArrayList<Varios> izq;
    String comp;
    ArrayList<Varios> der;

    public CondicionExpr(ArrayList<Varios> izq, String comp, ArrayList<Varios> der) {
        this.izq = izq;
        this.comp = comp;
        this.der = der;
    }

    @Override
    public String toString() {
        String parte = "";
        for(Varios v: izq){
            parte += v.toString();
        }
        parte += this.comp;
        for(Varios v: der) {
            parte += v.toString();
        }
        return parte;
    }
}
