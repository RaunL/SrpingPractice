package toys;

import battery.Battery;
import battery.NormalBattery;

//의존성을 주입하지 않고 하나로 묶여 있음
//ElectronicCarToy 클래스를 통해 객체 생성시 배터리는 이미 정해져 있음
public class ElectronicCarToy {

	private Battery battery;
	
	public void ElectronicCarToy() {
		battery = new NormalBattery();
	}
}
