package com.wood.pojo.game;

import java.io.Serializable;
/**
 * 
 * @类名：Image
 * @功能：图片PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Image implements Serializable {
	/**
	 * @desc 图片ID
	 */
	private Integer imgID;
	
	/**
	 * @desc 图片保存地址
	 */
	private String imgAddress;

	public Integer getImgID() {
		return imgID;
	}

	public void setImgID(Integer imgID) {
		this.imgID = imgID;
	}

	public String getImgAddress() {
		return imgAddress;
	}

	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}
	
	
}
