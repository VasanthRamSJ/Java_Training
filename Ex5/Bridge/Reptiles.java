package Ex5.Bridge;


public class Reptiles extends Animal {
    public Reptiles(Heart heart){
        super(heart);
    }
    void circulate(){
        System.out.println("I am a reptile..");
        heart.pumpBlood();
    }
}
