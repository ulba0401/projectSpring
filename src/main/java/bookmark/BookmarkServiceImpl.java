package bookmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.WordVO;

@Service
public class BookmarkServiceImpl implements BookmarkService{

	@Autowired BookmarkDAO dao;
	
	//ºÏ¸¶Å©ÇÑ ´Ü¾î ¸ñ·Ï Á¶È¸
	@Override
	public List<WordVO> selectMyBookmark(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//ºÏ¸¶Å© ´Ü¾î °¹¼ö Á¶È¸
	@Override
	public int selectMyBookmarkCnt(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	//ºÏ¸¶Å© Ãß°¡
	@Override
	public void insertBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

	//ºÏ¸¶Å© »èÁ¦
	@Override
	public void deleteBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

}
