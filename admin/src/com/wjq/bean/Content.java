package com.wjq.bean;

import java.util.Date;

public class Content implements java.io.Serializable{
	
	//����ID
		private Integer id;
		//������
		private String title;
		//��������
		private String content;
		//����ʱ��
		private Date createTime;
		//����ʱ��
		private Date updateTime;
		//������ID
		private Integer userId;
		//����������
		private String userName;
		//��ǩ
		private String tag;
		//�Ƿ��ö�
		private Integer isTop;
		//�Ƿ�ɾ��
		private Integer isDelete;
		//״̬
		private Integer status;
		//��ĿID
		private Integer channelId;
		//ͼƬ��ַ
		private String img;
		//�Ƿ�����
		private Integer push;
		//�Ƿ�����
		private Integer isComment;
		//�������
		private Integer hits;
		//ϲ������
		private Integer loves;
		//�ղ�����
		private Integer collections;
		//��̬����
		private String staticLink;
		//�ؼ���
		private String keywords;
		//����
		private String description;
		//�ӱ���
		private String subTitle;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
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
		public Date getUpdateTime() {
			return updateTime;
		}
		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getTag() {
			return tag;
		}
		public void setTag(String tag) {
			this.tag = tag;
		}
		public Integer getIsTop() {
			return isTop;
		}
		public void setIsTop(Integer isTop) {
			this.isTop = isTop;
		}
		public Integer getIsDelete() {
			return isDelete;
		}
		public void setIsDelete(Integer isDelete) {
			this.isDelete = isDelete;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getChannelId() {
			return channelId;
		}
		public void setChannelId(Integer channelId) {
			this.channelId = channelId;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		public Integer getPush() {
			return push;
		}
		public void setPush(Integer push) {
			this.push = push;
		}
		public Integer getIsComment() {
			return isComment;
		}
		public void setIsComment(Integer isComment) {
			this.isComment = isComment;
		}
		public Integer getHits() {
			return hits;
		}
		public void setHits(Integer hits) {
			this.hits = hits;
		}
		public Integer getLoves() {
			return loves;
		}
		public void setLoves(Integer loves) {
			this.loves = loves;
		}
		public Integer getCollections() {
			return collections;
		}
		public void setCollections(Integer collections) {
			this.collections = collections;
		}
		public String getStaticLink() {
			return staticLink;
		}
		public void setStaticLink(String staticLink) {
			this.staticLink = staticLink;
		}
		public String getKeywords() {
			return keywords;
		}
		public void setKeywords(String keywords) {
			this.keywords = keywords;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getSubTitle() {
			return subTitle;
		}
		public void setSubTitle(String subTitle) {
			this.subTitle = subTitle;
		}
		
		
		
	
}
