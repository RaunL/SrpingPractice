package toys;

import battery.Battery;

/*
 * 클래스를 이용하여 객체 생성시 battery가 정해지지 않음
 * 객체 생성 후 setBattery 메소드를 이용하여 배터리 선택(DI)
 */
public class ElectronicRobotToy {

	private Battery battery;
	
	public ElectronicRobotToy() {
		
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
}
