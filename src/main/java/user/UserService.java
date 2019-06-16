package user;

import java.util.List;

import VO.UserVO;

public interface UserService {
	
	//»ç¿ëÀÚ
	List<UserVO> selectAllUser();
	UserVO selectAUser(String id);
	void insertUser(UserVO vo);
	void deleteUser(String id);
	void updateUser(UserVO vo);
	void addAdminAuthority(String id);
	void removeAdminAuthority(String id);
}
