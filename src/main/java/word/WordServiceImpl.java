package word;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.WordVO;

@Service
public class WordServiceImpl implements WordService {

	@Autowired WordDAO dao;
	
	//전체단어보기
	@Override
	public List<WordVO> selectAllList(String methode) {
		return dao.selectAllList(methode);
	}

	//단원별 단어보기
	@Override
	public List<WordVO> selectUnitList(int unit) {
		// TODO Auto-generated method stub
		return null;
	}

	//단어 상세보기
	@Override
	public WordVO selectAWord(String abb) {
		// TODO Auto-generated method stub
		return null;
	}

	//단어 추가
	@Override
	public void insertWord(WordVO vo) {
		// TODO Auto-generated method stub
		
	}

	//단어 삭제
	@Override
	public void deleteWord(String abb) {
		// TODO Auto-generated method stub
		
	}

	//단어 수정
	@Override
	public void updateWord(WordVO vo) {
		// TODO Auto-generated method stub
		
	}

}
