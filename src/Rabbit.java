class Rabbit extends Animal{
    // Vars
    // Contructors
    public Rabbit(int x, int y){ super(x, y); } // reutilitzem el constructor de la classe mare
    // Methods
    @Override
    public String toString() { return "\uD83D\uDC30"; } // icona de conill
}