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
public class RecommendImg{
	  
        private List<Img> singleImg;//两张主图
        private List<Img> imgList;//
        private List<Img>  sildeImg;
        private List<Img>  tvsingleImg;
        private List<Img>  tvimgList;
        private List<Img>  starListImg;
        private List<Img>  starsingle;
        private List<Img>  newlineListImg;
        private List<Img>  newlinesingle;
		public List<Img> getStarListImg() {
			return starListImg;
		}
		public void setStarListImg(List<Img> starListImg) {
			this.starListImg = starListImg;
		}
		public List<Img> getStarsingle() {
			return starsingle;
		}
		public void setStarsingle(List<Img> starsingle) {
			this.starsingle = starsingle;
		}
		public List<Img> getNewlineListImg() {
			return newlineListImg;
		}
		public void setNewlineListImg(List<Img> newlineListImg) {
			this.newlineListImg = newlineListImg;
		}
		public List<Img> getNewlinesingle() {
			return newlinesingle;
		}
		public void setNewlinesingle(List<Img> newlinesingle) {
			this.newlinesingle = newlinesingle;
		}
		public List<Img> getTvsingleImg() {
			return tvsingleImg;
		}
		public void setTvsingleImg(List<Img> tvsingleImg) {
			this.tvsingleImg = tvsingleImg;
		}
		public List<Img> getTvimgList() {
			return tvimgList;
		}
		public void setTvimgList(List<Img> tvimgList) {
			this.tvimgList = tvimgList;
		}
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
