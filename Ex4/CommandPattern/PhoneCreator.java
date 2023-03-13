package CommandPattern;

class PhoneCreator{
	Command c[]=new Command[5];
	public PhoneCreator() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommand();
		}
	}
	
	public void executeCommand(int slot) {
		c[slot].makePhone();
	}
	
	public void assignCommand(int slot,Command command) {
		c[slot]=command;
	}
}