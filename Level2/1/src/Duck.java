class Duck extends Animal implements Swimable, Flyable {

    Duck (String name) {
        super(name);
        flyPower = 10;
        swimPower = 15;
        type = "Duck";

    }

    @Override
        public int  canSwim() {
        return this.swimPower;
    }
    @Override
       public int canFly (){
        return this.flyPower;
    }
}