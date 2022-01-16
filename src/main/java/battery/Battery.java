/*
 * 인터페이스란 동일한 목적 하에 동일한 기능을 보장하기 위해 사용
 * 자바의 다형성을 이용하여 개발코드의 수정을 줄이고 유지보수성을 높힌다.
 * 
 * 인터페이스에서는 4가지를 정의하거나 구현가능하다.
 * 상수, 추상메소드, 디폴트메소드, 정적메소드
 */

package battery;

public interface Battery {
	public int getBatteryValue();
}
