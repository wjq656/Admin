package com.wjq.bean;

import java.util.Date;

public class Comment implements java.io.Serializable{
	
	//����ID
	private Integer id;
	//��������
	private String content;
	//����ʱ��
	private Date createTime;
	//�����û���ID
	private Integer userId;
	//���µ�ID
	private Integer contentId;
	//�Ƿ�ɾ��    0��δɾ��  1����ɾ��
	private Integer isDelete;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	
	
}
