package com.wuyou.api;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wuyou.entity.Status;
import com.wuyou.entity.Useres;
import com.wuyou.entity.UseresExample;
import com.wuyou.service.UseresService;
import com.wuyou.util.AES;

@RestController
@CrossOrigin
@RequestMapping("/useres")
public class UseresController {
	@Autowired
	private UseresService useresService;
    //查询用户，假如后面跟参数ID  那么就根据ID查询信息
	@RequestMapping("/index")
	public List<Useres> queryList(Useres useres) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		List<Useres> useresList = null;
		UseresExample example = new UseresExample();
		UseresExample.Criteria criteria = example.createCriteria();
		// 解密
		String password = "12345678";
		AES aes = new AES();
		byte[] decryptFrom = null;
		byte[] decryptResult = null;
		String encryptResultStr = null;
		if (useres.getId() != null) {
			criteria.andIdEqualTo(useres.getId());
		}
		useresList = useresService.selectByExample(example);
		for (int i = 0; i < useresList.size(); i++) {
			String passWord = useresList.get(i).getPassword();
			encryptResultStr = passWord;
			decryptFrom = aes.parseHexStr2Byte(encryptResultStr);
			decryptResult = aes.decrypt(decryptFrom, password);
			useresList.get(i).setPassword(new String(decryptResult));
		}

		return useresList;
	}
    //用户信息修改插入   用户注册
	@RequestMapping("/edit")
	public Status edit(Useres useres) {
		Status status = new Status();
		List<Useres> useresList = null;
		// 加密
		AES aes = new AES();
		String password = "12345678";
		byte[] encryptResult = null;
		String encryptResultStr = null;
		if (useres.getId() != null) {
			if (useres.getPassword() != null) {
				encryptResult = aes.encrypt(useres.getPassword(), password);
				encryptResultStr = aes.parseByte2HexStr(encryptResult);
				useres.setPassword(encryptResultStr);
			}
			useres.setUsername(null);
			useresService.updateByPrimaryKeySelective(useres);
			status.setStatusCode(1);
			status.setMessage("修改成功");
			return status;
		} else {
			if (useres.getUsername() == null) {
				status.setStatusCode(0);
				status.setMessage("用户名为空");
				return status;
			} else {
				UseresExample example = new UseresExample();
				UseresExample.Criteria criteria = example.createCriteria();
				criteria.andUsernameEqualTo(useres.getUsername());
				useresList = useresService.selectByExample(example);
				if (useresList.size()!=0) {
					status.setStatusCode(0);
					status.setMessage("用户名已经被占用");
					return status;
				} else {
					encryptResult = aes.encrypt(useres.getPassword(), password);
					encryptResultStr = aes.parseByte2HexStr(encryptResult);
					useres.setPassword(encryptResultStr);
					useresService.insert(useres);
					status.setStatusCode(1);
					status.setMessage("添加成功");
					return status;
				}
			}
		}
	}
    //删除
	@RequestMapping("/delete")
	public Status delete(String id) {
		Status status = new Status();
		Integer delete = null;
		String[] deleteId = id.split(",");
		for (String i : deleteId) {
			delete = Integer.valueOf(i);
			useresService.deleteByPrimaryKey(delete);
		}
		status.setStatusCode(1);
		status.setMessage("删除成功");
		return status;
	}

	// 登录判断
	@RequestMapping("/iflogin")
	public Status ifLogin(Useres useres) {
		Status status = new Status();
		List<Useres> useresList = null;
		UseresExample example = new UseresExample();
		UseresExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(useres.getUsername());
		useresList = useresService.selectByExample(example);
		if (useresList.size()!=0) {
			Useres ifUseres = useresList.get(0);
			// 解密
			AES aes = new AES();
			String password = "12345678";
			byte[] decryptFrom = aes.parseHexStr2Byte(ifUseres.getPassword());
			byte[] decryptResult = aes.decrypt(decryptFrom, password);
			String ifpassword = new String(decryptResult);
			if (ifpassword.equals(useres.getPassword())) {
				status.setStatusCode(1);
				status.setMessage("登录成功");
				status.setUserid(ifUseres.getId());
				return status;
			} else {
				status.setStatusCode(0);
				status.setMessage("密码错误");
				return status;
			}
		} else {
			status.setStatusCode(0);
			status.setMessage("没有该用户");
			return status;
		}

	}
	@RequestMapping("selectUserId")
	public Integer selectUserId(String username) {
		UseresExample example = new UseresExample();
		UseresExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		Integer userid = useresService.selectByExample(example).get(0).getId();
		return userid;
		
	}

}
