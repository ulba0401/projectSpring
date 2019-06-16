package notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired NoticeDAO dao;

	//공지사항 리스트 조회
	@Override
	public List<NoticeVO> Noticelist() {
		// TODO Auto-generated method stub
		return null;
	}

	//공지사항 게시글 상세보기
	@Override
	public NoticeVO Noticedetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//공지사항 게시글 추가
	@Override
	public void insertNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}

	//공지사항 게시글 삭제
	@Override
	public void deleteNotice(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//공지사항 게시글 수정
	@Override
	public void updateNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}
}
