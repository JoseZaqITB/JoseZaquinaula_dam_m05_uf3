class Fox extends Animal{
    //vars
    // contructor
    public Fox(int x, int y){ super(x, y); } // reutilitzem el constructor de la classe mare
    // methods
    @Override
    public String toString() { return "\uD83D\uDC3A"; } // icona de llop
}
