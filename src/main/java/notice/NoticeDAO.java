package notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import VO.NoticeVO;

@Repository
public class NoticeDAO {

	@Autowired private SqlSession sql;
	
	//�������� ����Ʈ ��ȸ
	public List<NoticeVO> Noticelist() {
		// TODO Auto-generated method stub
		return null;
	}

	//�������� �Խñ� �󼼺���
	public NoticeVO Noticedetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//�������� �Խñ� �߰�
	public void insertNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}

	//�������� �Խñ� ����
	public void deleteNotice(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//�������� �Խñ� ����
	public void updateNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}
}
