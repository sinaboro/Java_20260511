package ex01;

public class Main {

	public static void main(String[] args) {		
		
		RemoteControl r1 = new TV();
		RemoteControl r2 = new Audio();
		
		r1.powerOn();
		r1.powerOff();
		
		r2.powerOn();
		r2.powerOff();
	}

}
