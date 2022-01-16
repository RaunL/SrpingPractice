package toys;

import battery.Battery;

/*
 * 클래스를 이용하여 객체 생성시 battery 주입
 * 하지만, setBattery메소드를 이용하여 배터리 추가 주입(DI)
 */
public class ElectronicRadioToy {
	
	private Battery battery;
	
	public ElectronicRadioToy(Battery battery) {
		this.battery = battery;
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
}
