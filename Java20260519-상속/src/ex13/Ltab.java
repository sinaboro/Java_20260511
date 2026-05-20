package ex13;

public class Ltab extends Mobile {

	public Ltab() {
		
	}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	
	@Override            //5
	public void operate(int time) {
		//1분 사용 시 배터리 10감소
		int batter = getBatterySize();  //500
		batter -= time*10;
		//batter = batter - time*10
		//batter  = 500 - 5 * 10 = 450
		setBatterySize(batter);		
	}

	@Override
	public void charge(int time) {
		//1분 충전 시 배터리 10증가 
		int batter = getBatterySize();  //500
		batter += time * 10;
		setBatterySize(batter);	
	}

}



