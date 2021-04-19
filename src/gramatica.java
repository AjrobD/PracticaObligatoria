import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class gramatica {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromFileName("prueba1.txt");
        FileOutputStream f = new FileOutputStream("prueba1.html");
        System.setOut(new PrintStream(f));
        // create a lexer that feeds off of input CharStream
        gramaticaLexer lexer = new gramaticaLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        gramaticaParser parser = new gramaticaParser(tokens);
    }
}
