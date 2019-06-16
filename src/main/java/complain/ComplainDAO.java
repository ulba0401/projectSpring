package complain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.ComplainVO;

@Repository
public class ComplainDAO {
	@Autowired private SqlSession sql;
	
	//고객센터 리스트 조회
	public List<ComplainVO> complainList() {
		// TODO Auto-generated method stub
		return null;
	}

	//고객센터 게시글 상세보기
	public ComplainVO complainDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//고객센터 게시글 등록
	public void insertComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//고객센터 게시글 삭제
	public void deleteComplain(String id) {
		// TODO Auto-generated method stub
		
	}

	//고객센터 게시글 수정
	public void updateComplain(ComplainVO vo) {
		// TODO Auto-generated method stub
		
	}

	//고객센터 게시글에 대하여 답변 이메일 전송
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	
}
