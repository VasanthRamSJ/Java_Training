package Day1;

public class Ex23 {
	public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println(sample.y);
        sample.printName();
    }
}
class Sample {
    protected String y = "vasanth";
    protected void printName() {
        System.out.println("Its "+y+" !!");
    }
}