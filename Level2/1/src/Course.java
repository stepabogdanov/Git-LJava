class Course {
    int[] obstacle = new int[3];

    Course(int waterBarrier, int airBarrier, int runningTrack) {
        this.obstacle[0] = waterBarrier;
        this.obstacle[1] = airBarrier;
        this.obstacle[2] = runningTrack;
    }

    void getObstacle() {
        for (int i : obstacle)
            System.out.println(i);
    }

    void doIt(Team t) {
        for (Animal an : t.getMembers()) {
            an.swimPower -= obstacle[0];
            an.flyPower -= obstacle[1];
            an.runPower -= obstacle[2];
        }
    }
}
