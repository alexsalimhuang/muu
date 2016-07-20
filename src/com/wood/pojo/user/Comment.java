package com.wood.pojo.user;

import java.io.Serializable;

/**
 * @类名：Comment
 * @功能： 评论PO
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class Comment implements Serializable{

	/**
	 * @desc 评论ID
	 */
	private Integer commID;
	
	/**
	 * @desc 交易PO
	 */
	private Transaction transaction;
	
	/**
	 * @desc 评论内容
	 */
	private String commContent;

	/**
	 * @desc 评分
	 */
	private Integer commScore;

	public Integer getCommID() {
		return commID;
	}

	public void setCommID(Integer commID) {
		this.commID = commID;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getCommContent() {
		return commContent;
	}

	public void setCommContent(String commContent) {
		this.commContent = commContent;
	}

	public Integer getCommScore() {
		return commScore;
	}

	public void setCommScore(Integer commScore) {
		this.commScore = commScore;
	}
	
	
}
