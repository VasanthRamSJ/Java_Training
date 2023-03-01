package StrategyPattern;
class Off extends State{
	public void mode(Fan fan){
		
		fan.state= new On();
		
	}
}