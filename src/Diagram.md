``` mermaid
classDiagram
 class Animal{
  EatRabbitSim game
  Tile[][] tauler
  int x
  int y
  boolean mort
  void update()
  String  toString()
  void mou()
  void mor()
  boolean isMort()
 }
 class EatRabbitSim{
    int CONILLS
    int LLOPS
    int COLUMNES
    int FILES
    int ROQUES
    int AIGUA
    List animals
    Tile[][] tauler
    int totalAnimals
    int torns
    void iniciatliza()
    void mostra()
    void main()
    int getTotalAnimals()
    Tile[][] getTauler()
    void decreaseTotalAnimals()
 }
 
 class Fox{
    int energia
    String toString()
    void update()
    void mou()
 }
 
 class Rabbit{
    void mor()
    String toString()
 }
 
 class Tile{
    int terreny
    Animal animal
    String string
    boolean esAigua()
    boolean esAnimal()
    void delAnimal()
    void setAnimal()
    String toString()
    Animal getAnimal()
    void setString()
    boolean esFox()
    boolean esRabbit()
    boolean esRock()
 }
 
 EatRabbitSim <-- Animal
 EatRabbitSim <-- Tile
 Tile <-- Animal
 Animal o-- Rabbit
 Animal o-- Fox
```