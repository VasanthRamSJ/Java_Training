package CommandPattern;

class BrandVasanth extends Command{
	public BrandVasanth(Display display, RAM ram, Processor processor, Camera cam) {
		super(display,ram,processor,cam);
	}
	@Override
	public void makePhone() {
		System.out.println("brand vasanth on making..");
	    display.samsungDisplay();
		ram._8gb();
		processor.appleProcessor();	
		cam.appleCamera();	
		System.out.println("enjoy your features..");
	}
}