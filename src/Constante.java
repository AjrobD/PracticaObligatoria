public class Constante extends Varios{
    public String constante;

    public Constante(String constante) {
        this.constante = constante;
    }

    @Override
    public String toString() {
        return "<SPAN CLASS='cte'>"+constante+"</SPAN>";
    }
}
