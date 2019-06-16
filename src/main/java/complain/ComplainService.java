package complain;

import java.util.List;

import VO.ComplainVO;


public interface ComplainService {

	//게시판 CRUD
	List<ComplainVO> complainList();
	ComplainVO complainDetail();
	void insertComplain(ComplainVO vo);
	void deleteComplain(String id);
	void updateComplain(ComplainVO vo);

	//이메일 보내기
	void sendEmail(String email);
	
}
