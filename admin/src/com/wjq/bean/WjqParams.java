package com.wjq.bean;

public class WjqParams {
	//
	private String id;
	//�û���
	private String username;
	//����
	private String password;
	//����
	private String email;
	//�ؼ���
	private String keyword;
	
	private String order;
	//ҳ��չʾ������
	private Integer pageSize = 3;
	//��ǰҳ��
	private Integer pageNum = 1;
	
	//pageSize*pageNum
	private Integer pageAll;
	
	

	private Integer channelId;
	
	
	
	
	
	
	
	
	
	public Integer getPageAll() {
		return pageAll;
	}
	public void setPageAll(Integer pageAll) {
		this.pageAll = pageAll;
	}

	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	private Integer totalCount = 0;
	
	
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
