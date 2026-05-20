package ex13;

public class Otab extends Mobile{

	public Otab() {		
	}

	public Otab(String mobileName, int batterySize, String osType) {		
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		//1분 사용 시 배터리 12감소
		int batter = getBatterySize();
		batter -= time*12;
		setBatterySize(batter);
	}

	@Override
	public void charge(int time) {
		//1분 충전 시 배터리 8증가
		int batter = getBatterySize();
		batter += time*8;
		setBatterySize(batter);
	}

}
