``` mermaid
classDiagram
 class Animal{
  int x
  int y
  boolean mort
  String  toString()
  void mou()
  void mor()
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
 }
 
 class Fox{
    int energia
    String toString()
    void mou()
 }
 
 class Rabbit{
    String toString()
 }
 
 class Tile{
    int terreny
    Animal animal
    boolean esAigua()
    boolean esAnimal()
    void delAnimal()
    void setAnimal()
    String toString()
    Animal getAnimal()
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