package CommandPattern;

public class CommandPattern {
	public static void main(String[] args) {
		PhoneCreator genie=new PhoneCreator();
		
		Display display=new Display();
		RAM ram=new RAM();
		Processor processor=new Processor();
		Camera cam=new Camera();
		
		Command vasanth=new BrandVasanth(display, ram, processor, cam);
		Command vasanthram=new BrandVasanthRam(display, ram, processor, cam);
	
		
		genie.assignCommand(1, vasanth);
		genie.assignCommand(2, vasanthram);
		genie.executeCommand(1);
	}
}
