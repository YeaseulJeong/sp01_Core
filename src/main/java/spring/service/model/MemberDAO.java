package spring.service.model;

// 비즈니스 로직의 Templet
public interface MemberDAO {
	void register(MemberVO vo) throws Exception;
	MemberVO findMember(String id) throws Exception;

}
