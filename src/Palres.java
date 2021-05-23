public class Palres extends Varios{
    public String palres;

    public Palres(String palres) {
        this.palres = palres;
    }

    @Override
    public String toString() {
        return "<SPAN CLASS='palres'>"+palres+"</SPAN>";
    }
}
