package notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired NoticeDAO dao;

	//�������� ����Ʈ ��ȸ
	@Override
	public List<NoticeVO> Noticelist() {
		// TODO Auto-generated method stub
		return null;
	}

	//�������� �Խñ� �󼼺���
	@Override
	public NoticeVO Noticedetail() {
		// TODO Auto-generated method stub
		return null;
	}

	//�������� �Խñ� �߰�
	@Override
	public void insertNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}

	//�������� �Խñ� ����
	@Override
	public void deleteNotice(String id) {
		// TODO Auto-generated method stub
		
	}
	
	//�������� �Խñ� ����
	@Override
	public void updateNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		
	}
}
