package StrategyPattern;

class LowSpeed extends State{
	public void mode(Fan fan) {
		fan.state=new HighSpeed();
		System.out.println("The fan is running at a low speed..");
	}
	
}