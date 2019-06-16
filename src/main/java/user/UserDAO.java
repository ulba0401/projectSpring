package user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.UserVO;

@Repository
public class UserDAO {

	@Autowired private SqlSession sql;
	
	//전체 회원 목록 조회
	public List<UserVO> selectAllUser() {
		// TODO Auto-generated method stub
		return sql.selectList("user-mapper.userList");
	}

	//회원정보 상세보기
	public UserVO selectAUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//회원가입
	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//회원탈퇴
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	//회원정보수정
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//관리자권한부여
	public void addAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//관리자권한삭제
	public void removeAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}
}
