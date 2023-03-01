package StrategyPattern;

public class Fan
{
	State state;
	
	public void turnOn() {
		
		state.mode(this);
	}
	}