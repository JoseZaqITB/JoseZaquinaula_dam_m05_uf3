class Fox extends Animal{
    //vars
    int energia = 10;
    // contructor
    public Fox(EatRabbitSim game,int x, int y){ super(game,x, y); } // reutilitzem el constructor de la classe mare
    // methods
    public void update(){
        if(energia == 0){
            tauler[x][y].setString("\uD83E\uDDB4");
            tauler[x][y].delAnimal();
        }
    }
    public void mou(){
        if(energia == 0){
            mor();// eliminem les referències a aquest objecte i confiem en el// garbage collector per a destruir-lo (ja que no té referències)
        }else {
            int i = (int) (Math.random() * 3) - 1 + x;
            int j = (int) (Math.random() * 3) - 1 + y;
            boolean dinsTauler = i >= 0 && i < tauler.length && j >= 0 && j < tauler[0].length;
            if (dinsTauler && !tauler[i][j].esAigua() && !tauler[i][j].esFox() ) {
                if (tauler[i][j].esRabbit()) {
                    tauler[i][j].getAnimal().mor();
                    energia += 10;
                }
                tauler[x][y].delAnimal();
                tauler[i][j].setAnimal(this);
                x = i;
                y = j;
                energia --;
            }
        }
    }
    @Override
    public String toString() { return "\uD83D\uDC3A"; } // icona de llop
}
