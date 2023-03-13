package CommandPattern;

class DummyCommand extends Command{
	@Override
	public void makePhone() {
		System.out.println("i am a dummy slot.....yet to be assigned a process...");
	}
}