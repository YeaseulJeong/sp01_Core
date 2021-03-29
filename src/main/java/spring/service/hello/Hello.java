package spring.service.hello;

/*
 * FileName : Hello.java
 * ㅇ package / private Field(property) / Constructor / getter,setter / 필요한 Method 
 * ㅇ를 갖는 빈 규약을 준한 일반적인 Bean ::  POJO(Plain Old Java Object)  // 그 누구로부터 상속받거나 구현 안한다는 자바클래스이다 _ 즉 제약을 받지 않는다
 */
public class Hello{
	
	///Field
	private String message = "Container 란 ?????";
	
	///Constructor Method
	public Hello() {
	}
	public Hello(String message) {
		this.message = message;
	}

	///Method
	//==> getter / setter Method definition
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//==> message 를 출력하는 Method  
	public void printMessage() { 
	// 여기서 printMessage1()으로 바꾸면  HelloTestApp01이든 어디서 즉각적으로 영향을 받는다 = 제사용이 제일 떨어지는 최악의 구조 = 이걸 보완하려고 DI 출현 
	// 결합도가 높다 Tight 한 coupling 
	// Hello 와 AppTest 를 직접적으로 연결 안시키게 하고 결합도를 떨어트리려고 하는게 인터페이스 사용한다. 하지만 완벽하게 해결이 안되기 때문에 Spring DI Framework 의 핵심
		
		System.out.println("\n"+getClass().getName()+"=>"+message);
	}
	
}//end of class