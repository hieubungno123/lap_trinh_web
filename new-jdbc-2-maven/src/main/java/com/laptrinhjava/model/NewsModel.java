package com.laptrinhjava.model;

public class NewsModel  extends AbstractModel<NewsModel>{
	
	private String title;
	private String thumbnall;
	private String shortDescription;
	private String content;
	private Long categoryId;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnall() {
		return thumbnall;
	}
	public void setThumbnall(String thumbnall) {
		this.thumbnall = thumbnall;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
	
}
