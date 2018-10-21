/**  
* <p>Title: AdAndAdPosition.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月13日  
* @version 1.0  
*/
package com.wuyou.entity;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年10月13日 
 */
public class AdAndAdPosition extends Ad{
    
	private String positionName;
	private Short adWidth;
    public Short getAdWidth() {
		return adWidth;
	}

	public void setAdWidth(Short adWidth) {
		this.adWidth = adWidth;
	}

	public Short getAdHeight() {
		return adHeight;
	}

	public void setAdHeight(Short adHeight) {
		this.adHeight = adHeight;
	}

	public String getPositionDesc() {
		return positionDesc;
	}

	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}

	private Short adHeight;
    private String positionDesc;

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	
}
