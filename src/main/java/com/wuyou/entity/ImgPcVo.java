/**  
* <p>Title: ImgPcVo.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月17日  
* @version 1.0  
*/
package com.wuyou.entity;

import java.util.List;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月17日 
 */
public class ImgPcVo extends Imgpc{
	public List<Imgpc> children;

	public List<Imgpc> getChildren() {
		return children;
	}

	public void setChildren(List<Imgpc> children) {
		this.children = children;
	}
}
