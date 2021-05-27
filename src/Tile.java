class Tile {
    // vars
    private int terreny = 0; // 0(terra, verd) 1(roca, gris) 2(aigua, blau)
    private Animal animal;
    private String string;
    // contructors
    public Tile(int terreny){
        this.terreny = terreny;
        animal = null;
        this.string = "";
    }
    public Tile(int terreny, Animal animal){
        this.animal = animal;
        this.terreny = terreny; // this(terreny); no era així per a reutilitzar un constructor sobrecarregat? :S
        this.string = "";
    }
    // getters and setters
    public boolean esAigua() {
        if(terreny == 2) return true;
        return false;
    }
    public boolean esRock() {
        if(terreny == 1) return true;
        return false;
    }
    public boolean esAnimal(){
        if(animal != null) return true;
        return false;
    }
    public boolean esRabbit(){
        if(animal instanceof Rabbit) return true;
        return false;
    }
    public boolean esFox(){
        if(animal instanceof Fox) return true;
        return false;
    }
    public Animal getAnimal() { return this.animal; }
    public void delAnimal(){
        this.animal = null;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public void setString(String string){
        this.string = string;
    }
    public String toString(){
        String grafic;
        switch (terreny){
            case 0: grafic = "\u001B[42m"; break;
            case 1: grafic = "\033[0;100m"; break;
            case 2: grafic = "\u001B[44m"; break;
            default: grafic = "\u001B[42m"; // terra per defecte
        }
        if(animal == null)
            return grafic + "  " + "\033[0m"; // 2 espais per a mantindre l'alineació
        if (!string.equals(""))
            return grafic + string + "\033[0m";
        return grafic + animal+ "\033[0m"; // reset, torna al color per defecte
    }
}