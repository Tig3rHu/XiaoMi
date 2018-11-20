/**  
* <p>Title: TVImg.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月13日  
* @version 1.0  
*/
package com.wuyou.entity;

import java.util.List;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月13日 
 */
public class TVImg {
	  private List<Img> singleImg;
      private List<Img> imgList;
	public List<Img> getSingleImg() {
		return singleImg;
	}
	public void setSingleImg(List<Img> singleImg) {
		this.singleImg = singleImg;
	}
	public List<Img> getImgList() {
		return imgList;
	}
	public void setImgList(List<Img> imgList) {
		this.imgList = imgList;
	}
}
