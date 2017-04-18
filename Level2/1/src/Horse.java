class Horse extends Animal implements Runnable {

    Horse(String name) {
        super(name);
        runPower = 20;
        type = "Horse";
    }

    @Override
    public int canRun() {
        return this.runPower;
    }
}