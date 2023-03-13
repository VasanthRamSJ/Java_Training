package Ex5.Bridge;

public class BridgePattern {
    public static void main(String[] args) {
        Animal animal = new SocialAnimal(new WarmBlooded());
        Animal animal1= new Reptiles(new ColdBlooded());
        animal.circulate();
        System.out.println();
        animal1.circulate();
    }
}
