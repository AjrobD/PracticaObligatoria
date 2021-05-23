public class Identificador extends Varios{
    public String identificador;

    public Identificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "<SPAN CLASS='ident'>"+identificador+"</SPAN>";
    }
}
