package com.wjq.bean;

import java.util.Date;

public class User implements java.io.Serializable{
	
	//����ID
	private  Integer id;
	//�˻���
	private String username;
	//����
	private String password;
	//����ʱ��
	private Date createTime;
	//����ʱ��
	private Date updateTime;
	//��½״̬  1��ʾ��ֹ  0��ʾ����
	private Integer forbiden;
	//�Ƿ�ɾ��  1��ʾ��ɾ��  0��ʾδɾ��
	private Integer isDelete;
	//����
	private Integer age;
	//�Ա�   0��ʾ��  1��ʾŮ
	private Integer male;
	//����
	private Date birthday;
	//סַ
	private String address;
	//����
	private String email;
	//��ϵ��ʽ �ֻ�
	private String  telephnoe;
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getForbiden() {
		return forbiden;
	}
	public void setForbiden(Integer forbiden) {
		this.forbiden = forbiden;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getMale() {
		return male;
	}
	public void setMale(Integer male) {
		this.male = male;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephnoe() {
		return telephnoe;
	}
	public void setTelephnoe(String telephnoe) {
		this.telephnoe = telephnoe;
	}
	
	
	
}
