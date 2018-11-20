/**  
* <p>Title: qiCameraController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月15日  
* @version 1.0  
*/
package com.wuyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月15日 
 */
@Controller
@RequestMapping("/qiqi")
public class qiCameraController {
   
	@RequestMapping("/camera")
	public String getcamara(){
		return "qiqi/camera";
		}
	@RequestMapping("/fat")
	public String getfat(){
		return "qiqi/fat";
		}
	@RequestMapping("/sweeper")
	public String getsweeper(){
		return "qiqi/sweeper";
		}
	@RequestMapping("/tabet")
	public String gettabet(){
		return "qiqi/tabet";
		}
	@RequestMapping("/purifier")
	public String getpurifier(){
		return "qiqi/purifier";
		}
	@RequestMapping("/phonecard")
	public String getphonecard(){
		return "kun/phonecard";
		}
	@RequestMapping("/xiaomi11")
	public String getxiaomi11(){
		return "kun/xiaomi11";
		}
	@RequestMapping("/xiaomibox")
	public String getxiaomibox(){
		return "kun/xiaomibox";
		}
	@RequestMapping("/xiaomilaptop")
	public String getxiaomilaptop(){
		return "kun/xiaomilaptop";
		}
	@RequestMapping("/xiaomitv")
		public String getxiaomitv(){
			return "kun/xiaomitv";
			}
	@RequestMapping("/details")
	public String getdetails(){
		return "buylaptop/details";
		}
	@RequestMapping("/page")
	public String getpage(){
		return "buylaptop/page";
		}
	@RequestMapping("/settlement")
	public String getsettlement(){
		return "buylaptop/settlement";
		}
	@RequestMapping("/shoppingcat")
	public String getshoppingcat(){
		return "buylaptop/shoppingcat";
		}
	@RequestMapping("/carousel")
	public String getcarousel(){
		return "buylaptop/carousel";
		}
	@RequestMapping("/xiaomiNav")
	public String getxiaomiNav(){
		return "youyou/xiaomiNav";
		}
	
	
}
