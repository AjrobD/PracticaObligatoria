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
        //AUN NO IMPLEMENTADO -> como tratamos para imprimir arrayList de varios
        return izq.toString() + comp + der.toString();
    }
}
