import java.util.ArrayList;

public class Program {
    ArrayList<Part> partes;

    public Program(Part parte1, ArrayList<Part> partes) {
        partes = new ArrayList<Part>();
        partes.add(parte1);
        partes.addAll(partes);
    }

    /* aqui no se genera todo el codigo html que se va a imprimir
    muchas partes del codigo se generan en el .java porque son cosas que program desconoce
    como el nombre del fichero de entrada
    <H2>Funciones y procedimientos</H2>
    <UL>
    <LI><A HREF="#areaCuadrado">real areaCuadrado ( real lado )</A></LI>
    <LI><A HREF="#intercambioEntero">intercambioEntero ( entero v1, entero v2)</A></LI>
    </UL>
     */
    @Override
    public String toString() {
        String pagina = "";
        pagina += "<H2>Funciones y procedimientos</H2> \n";
        pagina += "<UL> \n";
        for(Part parte : partes){
            String cabecera = parte.getCabecera();
            String nombre = parte.getNombre();
            pagina += "<LI>" + "<A HREF = '" + nombre + "'>" + cabecera + "</A></LI> \n";
        }
        pagina += "</UL> \n";
        for(Part parte : partes){
            pagina += "<HR/> \n";
        }
        return pagina;
    }
}
