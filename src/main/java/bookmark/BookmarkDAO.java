package bookmark;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.WordVO;

@Repository
public class BookmarkDAO {
	@Autowired private SqlSession sql;
	
	//�ϸ�ũ�� �ܾ� ��� ��ȸ
	public List<WordVO> selectMyBookmark(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//�ϸ�ũ �ܾ� ���� ��ȸ
	public int selectMyBookmarkCnt(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	//�ϸ�ũ �߰�
	public void insertBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

	//�ϸ�ũ ����
	public void deleteBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

}
