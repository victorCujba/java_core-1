public class Element {

    private final String name;
    private final String symbol;
    private final Integer atomicNumber;
    private final Double atomicMass;

    public Element(String name, String symbol, Integer atomicNumber, Double atomicMass) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public Double getAtomicMass() {
        return atomicMass;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Element)) {
            return false;
        }
        Element element = (Element) obj;
        return this.name.equals(element.name) &&
                this.symbol.equals(element.symbol) &&
                this.atomicNumber.equals(element.atomicNumber) &&
                this.atomicMass.equals(element.atomicMass);
    }

    @Override
    public String toString() {
        return String.format("\nElement: %s (%s)\n\t- atomic number: %s\n\t- atomic mass: %s\n", name, symbol, atomicNumber, atomicMass);
    }
}
