import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class gramatica {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName(args[0]);
            FileOutputStream f = new FileOutputStream(args[0]+".html");
            System.setOut(new PrintStream(f));
            gramaticaLexer analex = new gramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            gramaticaParser anasint = new gramaticaParser(tokens);
            System.out.println("<!DOCTYPE html>");
            System.out.println("<HTML>");
            System.out.println("<head>");
            System.out.println("<title>"+args[0]+"</title>");
            System.out.println("<style>");
            System.out.println(".cte {color:rgb(19,189,72);}");
            System.out.println(".ident {color:rgb(55,40,244);}");
            System.out.println(".palres {color:rgb(0,0,0);font-weight:bold;}");
            System.out.println("</style>");
            System.out.println("");
            System.out.println("<BODY>");
            System.out.println("<A NAME='inicio'>");
            System.out.println("<H1>Programa: "+args[0]+"</H1>");

            anasint.program();

            System.out.println("</BODY>");
            System.out.println("</HTML>");
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            System.err.println("RUN " + e.getMessage());
        }
    }
}
