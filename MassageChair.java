package day11_set_get;

public class MassageChair {

	boolean power;
	int intensity=1;
	String area;
	int timer;
	
	void power() {
		if(power == false) {
			power = true;
		} else {
			power = false;
		}
	}
	void intensityUp() {
		intensity++;
	}
	void intensityDown() {
		intensity--;
	}
	void timerUp() {
		timer += 5;
	}
	void timerDown() {
		timer -= 5;
	}
}
