package com.wjq.service.content;

import java.util.List;

import com.wjq.bean.Content;
import com.wjq.bean.WjqParams;

public interface IContentService {
	
	//��ȡ������Ϣ
	public List<Content> findContents(WjqParams params);
	//��ȡ������Ŀ
	public int ContentsAccount(WjqParams params);
	//��ȡ��ѯ������
	public List<Content> searchContents(WjqParams params);
	//��ѯ���µ�����
	public int searchAccount(WjqParams params);
	//�����Ƿ����ۣ��ƶ���ɾ��
	public int update(Content content);
}
