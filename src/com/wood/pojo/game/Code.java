package com.wood.pojo.game;

import java.io.Serializable;
/**
 * 
 * @类名：Code
 * @功能：激活码PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Code implements Serializable {
	/**
	 * @desc 激活码ID
	 */
	private Integer coID;
	
	/**
	 * @desc 激活码
	 */
	private String coContent;
	
	/**
	 * @desc 游戏ID
	 */
	private Integer gID;
	
	/**
	 * @desc 激活码库存数量
	 */
	private Integer coRemain;
	
	/**
	 * @desc 激活码已售数量
	 */
	private Integer coSold;

	public Integer getCoID() {
		return coID;
	}

	public void setCoID(Integer coID) {
		this.coID = coID;
	}

	public String getCoContent() {
		return coContent;
	}

	public void setCoContent(String coContent) {
		this.coContent = coContent;
	}

	public Integer getgID() {
		return gID;
	}

	public void setgID(Integer gID) {
		this.gID = gID;
	}

	public Integer getCoRemain() {
		return coRemain;
	}

	public void setCoRemain(Integer coRemain) {
		this.coRemain = coRemain;
	}

	public Integer getCoSold() {
		return coSold;
	}

	public void setCoSold(Integer coSold) {
		this.coSold = coSold;
	}
	
	
}
