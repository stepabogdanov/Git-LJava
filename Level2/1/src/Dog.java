class Dog extends Animal implements Runnable, Swimable {

    Dog(String name) {
        super(name);
        runPower = 15;
        swimPower = 5;
        type = "Dog";
    }

    @Override
    public int canRun() {
        return this.runPower;
    }

    @Override
    public int canSwim() {return this.swimPower; }
}