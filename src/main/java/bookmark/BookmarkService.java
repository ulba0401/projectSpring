package bookmark;

import java.util.List;

import VO.WordVO;

public interface BookmarkService {

	//ºÏ¸¶Å©
	List<WordVO> selectMyBookmark(String id);	
	int selectMyBookmarkCnt(String id);
	void insertBookmark(String full);
	void deleteBookmark(String full);

	
}
