package bookmark;

import java.util.List;

import VO.WordVO;

public interface BookmarkService {

	//�ϸ�ũ
	List<WordVO> selectMyBookmark(String id);	
	int selectMyBookmarkCnt(String id);
	void insertBookmark(String full);
	void deleteBookmark(String full);

	
}
