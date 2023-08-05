package java_oop.Sem5;

public enum Operator {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator fromString(String symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.symbol.equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Invalid operator symbol: " + symbol);
    }
}

