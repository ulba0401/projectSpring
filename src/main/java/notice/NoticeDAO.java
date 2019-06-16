package notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.NoticeVO;

@Repository
public class NoticeDAO {

	@Autowired private SqlSession sql;
	
	//공지사항 리스트 조회
	public List<NoticeVO> Noticelist() {
		// TODO Auto-generated method stub
		return null;
	}

	//공지사항 게시글 상세보기
	public NoticeVO Noticedetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//공지사항 게시글 추가
	public void insertNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}

	//공지사항 게시글 삭제
	public void deleteNotice(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//공지사항 게시글 수정
	public void updateNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}
}
