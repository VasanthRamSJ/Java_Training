package StrategyPattern;

class On extends State{
	public void mode(Fan fan) {
		fan.state= new LowSpeed();
		System.out.println("The fan is in ON state!");
	}
	
}