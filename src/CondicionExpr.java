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
        String condicion = "";
        int contador = 0;
        for(Varios varioIzq : izq){
            contador++;
            condicion += varioIzq.toString();
            if(contador< izq.size()){
                condicion+=" ";
            }
        }
        condicion += " "+comp+" ";
        for(Varios varioDer : der){
            contador++;
            condicion += varioDer.toString();
            if(contador< der.size()){
                condicion+=" ";
            }
        }
        return condicion;
    }
}
