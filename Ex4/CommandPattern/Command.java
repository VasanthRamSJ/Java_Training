package CommandPattern;

abstract class Command{
	Display display;RAM ram;Processor processor;Camera cam;
	public Command() {
		
	}
	
	public Command(Display display, RAM ram, Processor processor, Camera cam) {
		this.display = display;
		this.ram = ram;
		this.processor = processor;
		this.cam = cam;
	}
	public abstract void makePhone();
}