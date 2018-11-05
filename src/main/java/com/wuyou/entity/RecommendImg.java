/**  
* <p>Title: RecommendImg.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月5日  
* @version 1.0  
*/
package com.wuyou.entity;

import java.util.List;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月5日 
 */
public class RecommendImg {
	  
        private List<Img> singleImg;
        private List<Img> imgList;
        private List<Img>  sildeImg;
		public List<Img> getSildeImg() {
			return sildeImg;
		}
		public void setSildeImg(List<Img> sildeImg) {
			this.sildeImg = sildeImg;
		}
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
		@Override
		public String toString() {
			return "RecommendImg [singleImg=" + singleImg + ", imgList=" + imgList
					+ "]";
		}
}
