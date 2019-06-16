package user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserDAO dao;
	
	//전체 회원 목록 조회
	@Override
	public List<UserVO> selectAllUser() {
		// TODO Auto-generated method stub
		return dao.selectAllUser();
	}

	//회원정보 상세보기
	@Override
	public UserVO selectAUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//회원가입
	@Override
	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//회원탈퇴
	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	//회원정보수정
	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//관리자권한부여
	@Override
	public void addAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//관리자권한삭제
	@Override
	public void removeAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}

}
