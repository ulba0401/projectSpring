package notice;

import java.util.List;

import VO.NoticeVO;

public interface NoticeService {
	
	//게시판 CRUD
	List<NoticeVO> Noticelist();
	NoticeVO Noticedetail();
	void insertNotice(NoticeVO vo);
	void deleteNotice(String id);
	void updateNotice(NoticeVO vo);

	//댓글기능
	
}
