abstract class Animal{
    // vars
    int x, y;
    boolean mort;
    // contructors
    public Animal(int x, int y){
        this.x = x;
        this.y = y;
        mort = false;
    }
    // methods
    public void mor() {
        this.mort = true;
    }
    public abstract String toString();
    public void mou(){
        if(mort) return;
        Tile[][] tauler = EatRabbitSim.tauler;
        int i = (int) (Math.random() * 3) - 1 +x;
        int j = (int) (Math.random() * 3) - 1 +y;
        if(i >= 0 && i < tauler.length && j >= 0 && j < tauler[0].length &&
                !tauler[i][j].esAigua() && !tauler[i][j].esAnimal()){
            tauler[x][y].delAnimal();
            tauler[i][j].setAnimal(this);
            x=i; y=j;
        }
    }
}