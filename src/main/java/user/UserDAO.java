package user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.UserVO;

@Repository
public class UserDAO {

	@Autowired private SqlSession sql;
	
	//��ü ȸ�� ��� ��ȸ
	public List<UserVO> selectAllUser() {
		// TODO Auto-generated method stub
		return sql.selectList("user-mapper.userList");
	}

	//ȸ������ �󼼺���
	public UserVO selectAUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//ȸ������
	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//ȸ��Ż��
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	//ȸ����������
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	//�����ڱ��Ѻο�
	public void addAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//�����ڱ��ѻ���
	public void removeAdminAuthority(String id) {
		// TODO Auto-generated method stub
		
	}
}
