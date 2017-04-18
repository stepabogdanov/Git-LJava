 class Animal {
    protected String name;
    protected String type;
    protected int flyPower;
    protected int swimPower;
    protected int runPower;

    Animal (String name) {
        this.name = name;
        type = "Animal";
    }

    @Override
    public String toString() {
        return ("Name: " + name + " Type: " + type);

    }
}