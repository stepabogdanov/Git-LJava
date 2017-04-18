class Cat extends Animal implements Runnable {

    Cat (String name) {
        super(name);
        runPower = 10;
        type = "Cat";
    }

    @Override
    public int canRun() {

        return this.runPower;
    }

    String getName(){
        return super.name;
    }

}