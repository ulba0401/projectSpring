package user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserDAO dao;
	
	//��ü ȸ�� ��� ��ȸ
	@Override
	public List<UserVO> selectAllUser() {
		// TODO Auto-generated method stub
		return dao.selectAllUser();
	}

	//ȸ������ �󼼺���
	@Override
	public UserVO selectAUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//ȸ������
	@Override
	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//ȸ��Ż��
	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	//ȸ����������
	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//�����ڱ��Ѻο�
	@Override
	public void addAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//�����ڱ��ѻ���
	@Override
	public void removeAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}

}
