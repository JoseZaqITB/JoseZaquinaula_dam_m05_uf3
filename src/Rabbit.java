class Rabbit extends Animal{
    // Vars
    // Contructors
    public Rabbit(EatRabbitSim game,int x, int y){ super(game,x, y); } // reutilitzem el constructor de la classe mare
    // Methods

    @Override
    public void mor() {
        super.mor();
        tauler[x][y].setString("\uD83C\uDF56");
    }

    @Override
    public String toString() { return "\uD83D\uDC30"; } // icona de conill
}