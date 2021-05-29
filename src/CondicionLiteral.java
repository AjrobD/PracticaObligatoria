public class CondicionLiteral extends Condicion{
    private String literal; //Por el g4, solo sera cierto o falso

    public CondicionLiteral(String literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return literal;
    }
}
