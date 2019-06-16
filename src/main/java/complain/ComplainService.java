package complain;

import java.util.List;

import VO.ComplainVO;


public interface ComplainService {

	//�Խ��� CRUD
	List<ComplainVO> complainList();
	ComplainVO complainDetail();
	void insertComplain(ComplainVO vo);
	void deleteComplain(String id);
	void updateComplain(ComplainVO vo);

	//�̸��� ������
	void sendEmail(String email);
	
}
