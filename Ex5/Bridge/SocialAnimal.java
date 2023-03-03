package Ex5.Bridge;


public class SocialAnimal extends Animal {
    public SocialAnimal(Heart heart){
        super(heart);
    }

    void circulate(){
       System.out.println("I am human!");
        heart.pumpBlood();
    }
}
