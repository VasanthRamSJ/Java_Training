package CommandPattern;

  class BrandVasanthRam extends Command {
    public BrandVasanthRam(Display display, RAM ram, Processor processor, Camera cam) {
		super(display,ram,processor,cam);
	}
	@Override
	public void makePhone() {
		System.out.println("brand vasanth ram processing..");
		display.appleDisplay();
		ram._12gb();
		processor.samsungProcessor();	
		cam.appleCamera();	
		System.out.println("enjoy your features");
	}
}