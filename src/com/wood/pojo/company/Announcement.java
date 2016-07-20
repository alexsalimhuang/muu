package com.wood.pojo.company;

import java.io.Serializable;
/**
 * 
 * @类名：Announcement
 * @功能：公告PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Announcement implements Serializable{

	/**
	 * @desc 公告ID
	 */
	private Integer anID;
	/**
	 * @desc 公告内容
	 */
	private String anContent;
	
	public Integer getAnID() {
		return anID;
	}
	public void setAnID(Integer anID) {
		this.anID = anID;
	}
	public String getAnContent() {
		return anContent;
	}
	public void setAnContent(String anContent) {
		this.anContent = anContent;
	}
	
	
	
}
