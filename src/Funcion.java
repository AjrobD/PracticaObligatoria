import java.util.ArrayList;

public class Funcion extends Part{
    
    String tipo;
    
    public Funcion(String nombre, String tipo, ArrayList<Parametro> variables, ArrayList<Sentencia> sentencias) {
        super(nombre, variables, sentencias);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String parte = "";
        parte += "<HR/> \n";
        parte += "<A NAME='"+this.getNombre()+"'> </A>\n";
        parte += "<SPAN CLASS='palres'>";
        parte += "funcion";
        parte += "</SPAN> ";
        parte += "<SPAN CLASS='palres'>" +this.getTipo()+"</SPAN> ";
        parte += "<SPAN CLASS='ident'>" + this.getNombre() + "</SPAN> ( ";
        int contador = 0;
        for(Parametro parametro: variables){
            contador++;
            parte += "<SPAN CLASS='palres'>" + parametro.getTipo() + "</SPAN> ";
            parte += "<SPAN CLASS='ident'>" + parametro.getNombre() + "</SPAN>";
            if(contador< variables.size()) {
                parte += ", ";
            }
        }
        parte += ") <BR/>";
        parte += "<SPAN CLASS='palres'>inicio</SPAN><BR/>";

        for(Sentencia sentencia: sentencias){
            parte += sentencia.toString();
        }

        parte += "<SPAN CLASS='palres'>fin</SPAN><BR/>";
        parte += "<A HREF='#" + this.getNombre() +"'>Inicio de rutina</A><BR/>";
        parte += "<A HREF='#inicio'>Inicio de programa</A><BR/>";
        return parte;
    }

    @Override
    public String getCabecera() {
        String cabecera = "";
        cabecera += tipo+" ";
        cabecera += nombre+" ";
        cabecera += "( ";
        int contador = 0;
        for(Parametro parametro : variables){
            contador++;
            cabecera += parametro.getTipo()+" ";
            cabecera += parametro.getNombre();
            if(contador< variables.size()) {
                cabecera += ", ";
            }
        }
        cabecera += ")</A></LI>";
        return cabecera;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

}
