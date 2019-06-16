package bookmark;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.WordVO;

@Repository
public class BookmarkDAO {
	@Autowired private SqlSession sql;
	
	//ºÏ¸¶Å©ÇÑ ´Ü¾î ¸ñ·Ï Á¶È¸
	public List<WordVO> selectMyBookmark(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//ºÏ¸¶Å© ´Ü¾î °¹¼ö Á¶È¸
	public int selectMyBookmarkCnt(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	//ºÏ¸¶Å© Ãß°¡
	public void insertBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

	//ºÏ¸¶Å© »èÁ¦
	public void deleteBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

}
