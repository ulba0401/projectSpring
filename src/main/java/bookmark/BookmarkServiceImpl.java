package bookmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.WordVO;

@Service
public class BookmarkServiceImpl implements BookmarkService{

	@Autowired BookmarkDAO dao;
	
	//�ϸ�ũ�� �ܾ� ��� ��ȸ
	@Override
	public List<WordVO> selectMyBookmark(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//�ϸ�ũ �ܾ� ���� ��ȸ
	@Override
	public int selectMyBookmarkCnt(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	//�ϸ�ũ �߰�
	@Override
	public void insertBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

	//�ϸ�ũ ����
	@Override
	public void deleteBookmark(String full) {
		// TODO Auto-generated method stub
		
	}

}
