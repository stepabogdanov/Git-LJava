class Plate {
    private int food;
    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int portion) {
        food -= portion;
        if (food <=0) food =0;
    }

    @Override
    public String toString() {
        return "plate: " + food + "\n ";
    }
    
    int getFood() {
        int f = food;
        return f;
    }
    
    void addFood(int portion) {
        food += portion;
    }
    
}