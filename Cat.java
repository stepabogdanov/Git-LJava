class Cat {
    private String name;
    private int volume; // способность съесть за 1 подход
    private boolean feed;

    Cat(String name, int volume) {
        this.name = name;
        this.volume = volume;
        feed = false;
        
    }

    void eat(Plate plate) {
        if (plate.getFood() >= volume) {
            plate.decreaseFood(volume);
            feed = true;	
        }
        else feed = false;
    }
    
    boolean getFeed () {
        boolean f = feed;
        return f;
    }

    @Override
    public String toString() {
        return "cat: " + name + " volume: " + volume + " feed: " + getFeed();
    }
}