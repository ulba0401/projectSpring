package word;

import java.util.List;

import VO.WordVO;

public interface WordService {

	//�ܾ����
	List<WordVO> selectAllList(String methode);
	List<WordVO> selectUnitList(int unit);
	WordVO selectAWord(String abb);
	void insertWord(WordVO vo);
	void deleteWord(String abb);
	void updateWord(WordVO vo);
	
}
