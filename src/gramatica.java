import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class gramatica {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName(args[0]);
            gramaticaLexer analex = new gramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            gramaticaParser anasint = new gramaticaParser(tokens);
            anasint.program();
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            System.err.println("RUN " + e.getMessage());
        }
    }
}
