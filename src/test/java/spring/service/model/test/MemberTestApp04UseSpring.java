package spring.service.model.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.model.MemberDAO;
import spring.service.model.MemberVO;

public class MemberTestApp04UseSpring {

	public static void main(String[] args) throws Exception {
		
		// 1. DI 컨테이너 생성... 이때 주문서 함께 읽도록 같이 저장한다 
		// 주문서를 받아서 Bean 생성하고 저장
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/config/member.xml"));
		
		//2. 컨테이너에서 생성된 객체를 받아와서 (IOC: Inversion of Controller_ 권리의 역전 : 객체생성의 주체가 바뀌었다 )
		// 가져와서 쓴다
		// 소스 코드에서는 실체 클래스가 절대 언급이 안된다 _ 재사용성이 완전히 떨어지기 때문이다   (그래서 new 가 나오면 안된다_ 실제 클래스든, 인터페이스든 new 를 쓰기때문에 결합도를 아예 절대로 끊을 수는 없다)
		// 소스코드는 무조건 인터페이스 (MemberDAO) 로 소통한다 _ 재사용성이 올라간다  
		MemberDAO dao = (MemberDAO) factory.getBean("dao");
		
		//3. 받아온 빈의 메서드를 호출
		dao.register(new MemberVO("1","1","1","1"));
	}
	
}//end of class