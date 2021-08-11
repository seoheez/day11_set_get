package day11_set_get;

public class Fan {

	public boolean power;
	public int timer; 
	public int intensity;

	void power() {
		if(power == false) {
			power = true;
		}else {
			power = false;
		}
	}

	
	void timerUP() {
		timer+=10; 
	}
	void timerDown() {
		timer-=10; 
	}
	void intensityUP() {
		++intensity; 
	}
	void intensityDown() {
		--intensity; 
	} 
}
	