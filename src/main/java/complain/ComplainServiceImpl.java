package complain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.ComplainVO;

@Service
public class ComplainServiceImpl implements ComplainService{

	@Autowired ComplainDAO dao;

	//고객센터 리스트 조회
	@Override
	public List<ComplainVO> complainList() {
		// TODO Auto-generated method stub
		return null;
	}

	//고객센터 게시글 상세보기
	@Override
	public ComplainVO complainDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//고객센터 게시글 등록
	@Override
	public void insertComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//고객센터 게시글 삭제
	@Override
	public void deleteComplain(String id) {
		// TODO Auto-generated method stub
		
	}

	//고객센터 게시글 수정
	@Override
	public void updateComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//고객센터 게시글에 대하여 답변 이메일 전송
	@Override
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	
}
