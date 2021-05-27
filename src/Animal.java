abstract class Animal{
    // vars
    EatRabbitSim game;
    Tile[][] tauler;
    int x, y;
    boolean mort;
    // contructors
    public Animal(EatRabbitSim game, int x, int y){
        this.game = game;
        tauler = game.getTauler();
        this.x = x;
        this.y = y;
        mort = false;
    }
    // methods
    public void mor() {
        this.mort = true;
        game.decreaseTotalAnimals(1);
    }
    public abstract String toString();
    public void update(){
        if ( mort ){
            tauler[x][y].delAnimal();
        }
    }
    public void mou(){
        if(mort) return;
        int i = (int) (Math.random() * 3) - 1 +x;
        int j = (int) (Math.random() * 3) - 1 +y;
        if(i >= 0 && i < tauler.length && j >= 0 && j < tauler[0].length &&
                !tauler[i][j].esAigua() && !tauler[i][j].esAnimal()){
            tauler[x][y].delAnimal();
            tauler[i][j].setAnimal(this);
            x=i; y=j;
        }
    }
    //

    public boolean isMort() {
        return mort;
    }
}