import java.util.ArrayList;

public class Program {
    ArrayList<Part> partes;

    public Program(Part parte1, ArrayList<Part> partes) {
        this.partes = new ArrayList<Part>();
        this.partes.add(parte1);
        this.partes.addAll(partes);
    }

    /* aqui no se genera todo el codigo html que se va a imprimir
    muchas partes del codigo se generan en el .java porque son cosas que program desconoce
    como el nombre del fichero de entrada*/
    @Override
    public String toString() {
        String pagina = "";
        pagina += "<H2>Funciones y procedimientos</H2> \n";
        pagina += "<UL> \n";
        for(Part parte : partes){
            String cabecera = parte.getCabecera();
            String nombre = parte.getNombre();
            pagina += "<LI>" + "<A HREF = '#" + nombre + "'>" + cabecera;
        }
        pagina += "</UL> \n";
        pagina += "\n";
        for(Part parte : partes){
            pagina += parte.toString();
        }
        return pagina;
    }
}
