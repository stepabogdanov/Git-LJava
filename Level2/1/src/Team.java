class Team   {
    protected String teamName;
    private Animal[] animals;

    Team (String teamName, Animal[] animals) {
    this.teamName = teamName;
    this.animals = animals;
    }

    Animal[] getMembers () {
        return animals;
    }
    void getMembersName () {
        System.out.println(this.teamName + " ");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
    void showResults() {
        System.out.print(this.teamName + "\n");
        for (Animal a : animals) {
            if (a.swimPower >=0 && a.runPower >= 0 && a.flyPower >= 0)
                System.out.println("Passed the distance: " + a.type + " " + a.name);
        }
    }

}