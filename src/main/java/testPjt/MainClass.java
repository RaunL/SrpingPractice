package testPjt;

//import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/*
		//applicationContext.xml에 의해 자바 컨테이너(메모리)에 올라갔으므로 new로 선언할 필요가 없음
		TransportationWalk transportationWalk = new TransportationWalk();
		transportationWalk.move();
		*/
		
		//applicationContext.xml 즉 컨테이너에 접근하기위한 방법(데이터 타입)
		//GenericApplicationContext 아래 자식 클래스로 GenericXmlApplicationContext가 존재
		//이것이 컨테이너
		// new GenericXmlApplicationContext("classpath:자원위치");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		//컨테이너에 있는 객체(Bean)을 가져온다.
		//getBean(Bean의 아이디, 사용할 데이터 타입)
		TransportationWalk transportationWalk = ctx.getBean("tWalk",TransportationWalk.class);
		transportationWalk.move();
		
		//외부 리소스 사용 후 리소스 반환 처리
		ctx.close();
	}
}
