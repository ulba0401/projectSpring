package complain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.ComplainVO;

@Repository
public class ComplainDAO {
	@Autowired private SqlSession sql;
	
	//������ ����Ʈ ��ȸ
	public List<ComplainVO> complainList() {
		// TODO Auto-generated method stub
		return null;
	}

	//������ �Խñ� �󼼺���
	public ComplainVO complainDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//������ �Խñ� ���
	public void insertComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//������ �Խñ� ����
	public void deleteComplain(String id) {
		// TODO Auto-generated method stub
		
	}

	//������ �Խñ� ����
	public void updateComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//������ �Խñۿ� ���Ͽ� �亯 �̸��� ����
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	
}
