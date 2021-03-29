package spring.service.model;

public class MemberDAOImpl implements MemberDAO {  
	
	// component 이다 : 인터페이스를 상속받아서 ~~~????

	@Override
	public void register(MemberVO vo) throws Exception {
		// DB 연결했다고 치고 
		System.out.println("회원 입력 성공^^ "+ vo);
		
	}

	@Override
	public MemberVO findMember(String id) throws Exception {
		// DB 연결했다고 치고
		System.out.println("회원 검색 결과 입니다");
		MemberVO vo = new MemberVO(id,"1111", "James", "Texas");
	
		return vo;
	}
	
	

}
