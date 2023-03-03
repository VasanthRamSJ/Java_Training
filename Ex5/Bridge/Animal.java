package Ex5.Bridge;
abstract public class Animal {
    Heart heart;
    public Animal(Heart heart){
        this.heart=heart;
    }
    abstract void circulate();
}
