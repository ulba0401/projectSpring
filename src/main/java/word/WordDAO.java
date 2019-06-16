package word;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.WordVO;

@Repository
public class WordDAO {

	@Autowired SqlSession sql;
	List<WordVO> list = null;
	
	//��ü�ܾ��
	public List<WordVO> selectAllList(String methode) {
	
		if (methode.equals("asc")) {
			list = sql.selectList("word-mapper.ascList");
		}else if (methode.equals("unit")) {
			list = sql.selectList("word-mapper.unitAllList");
		}
		
		return list;
	}

	//�ܿ��� �ܾ��
	public List<WordVO> selectUnitList(int unit) {
		// TODO Auto-generated method stub
		return null;
	}

	//�ܾ� �󼼺���
	public WordVO selectAWord(String abb) {
		// TODO Auto-generated method stub
		return null;
	}

	//�ܾ� �߰�
	public void insertWord(WordVO vo) {
		// TODO Auto-generated method stub
		
	}

	//�ܾ� ����
	public void deleteWord(String abb) {
		// TODO Auto-generated method stub
		
	}

	//�ܾ� ����
	public void updateWord(WordVO vo) {
		// TODO Auto-generated method stub
		
	}
}
