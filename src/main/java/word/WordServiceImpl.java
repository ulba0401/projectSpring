package word;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.WordVO;

@Service
public class WordServiceImpl implements WordService {

	@Autowired WordDAO dao;
	
	//��ü�ܾ��
	@Override
	public List<WordVO> selectAllList(String methode) {
		return dao.selectAllList(methode);
	}

	//�ܿ��� �ܾ��
	@Override
	public List<WordVO> selectUnitList(int unit) {
		// TODO Auto-generated method stub
		return null;
	}

	//�ܾ� �󼼺���
	@Override
	public WordVO selectAWord(String abb) {
		// TODO Auto-generated method stub
		return null;
	}

	//�ܾ� �߰�
	@Override
	public void insertWord(WordVO vo) {
		// TODO Auto-generated method stub
		
	}

	//�ܾ� ����
	@Override
	public void deleteWord(String abb) {
		// TODO Auto-generated method stub
		
	}

	//�ܾ� ����
	@Override
	public void updateWord(WordVO vo) {
		// TODO Auto-generated method stub
		
	}

}
