package complain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.ComplainVO;

@Service
public class ComplainServiceImpl implements ComplainService{

	@Autowired ComplainDAO dao;

	//������ ����Ʈ ��ȸ
	@Override
	public List<ComplainVO> complainList() {
		// TODO Auto-generated method stub
		return null;
	}

	//������ �Խñ� �󼼺���
	@Override
	public ComplainVO complainDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//������ �Խñ� ���
	@Override
	public void insertComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//������ �Խñ� ����
	@Override
	public void deleteComplain(String id) {
		// TODO Auto-generated method stub
		
	}

	//������ �Խñ� ����
	@Override
	public void updateComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//������ �Խñۿ� ���Ͽ� �亯 �̸��� ����
	@Override
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	
}
