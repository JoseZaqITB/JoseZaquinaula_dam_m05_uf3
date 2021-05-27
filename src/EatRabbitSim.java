//versió 0
import java.util.ArrayList;
import java.util.Scanner;

public class EatRabbitSim {
    // Vars
    public static final int CONILLS = 5, LLOPS = 3, COLUMNES = 16, FILES = 16, ROQUES = 10, AIGUA = 15;
    public static ArrayList<Animal> animals = new ArrayList<>();
    public static Tile[][] tauler = new Tile[COLUMNES][FILES];
    private int totalAnimals, torns = 0;
    // methods
    public void inicialitza(){
        for (int i = 0; i < COLUMNES ; i++) {
            for (int j = 0; j < FILES; j++) {
                int terreny = (int) (Math.random() * 100);
                int t = 0;
                int animal = (int) (Math.random() * 100);
                if (terreny < ROQUES)
                    t = 1;
                else if (terreny < ROQUES + AIGUA)
                    t = 2;
                Animal a = null;
                if (t == 2 || animal >= LLOPS + CONILLS) {
                    tauler[i][j] = new Tile(t);
                }
                else{
                    if (animal < LLOPS) {
                        a = new Fox(i, j);
                        animals.add(a);
                    } else if (animal < LLOPS + CONILLS) {
                        a = new Rabbit(i, j);
                        animals.add(a);
                    }
                    tauler[i][j] = new Tile(t, a);
                }
            }
        }
        totalAnimals = animals.size();
    }
    public void mostra(){
        for (int i = 0; i < FILES; i++) {
            for (int j = 0; j < COLUMNES; j++) {
                System.out.print(tauler[i][j]);
            }
            System.out.println();
        }
        System.out.println("\uD83E\uDDE1" + animals.size() + "/" + totalAnimals + "  \uD83D\uDD50" + torns);
    }
    // main
    public static void main(String[] args){

        EatRabbitSim joc = new EatRabbitSim();
        joc.inicialitza();
        Scanner scanner = new Scanner(System.in);
        while (animals.size() > 0){
            animals.forEach(Animal::update);
            animals.forEach(Animal::mou);
            joc.torns ++;
            joc.mostra();
            scanner.nextLine();
        }
        joc.mostra();
        System.out.println("Has destruit tota vida a la vista, bon treball \uD83D\uDE05");
    }
}