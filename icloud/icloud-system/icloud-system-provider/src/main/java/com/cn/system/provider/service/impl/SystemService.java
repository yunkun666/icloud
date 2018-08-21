package com.cn.system.provider.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.system.api.service.ISystemService;

/**
 * 系统管理，安全相关实体的管理类,包括用户、角色、菜单.
 * @author zhangxd
 */
@Service
@Transactional(readOnly = true)
public class SystemService implements ISystemService {

	@Override
	public String test(String id) {
		return "接口返回"+id;
	}
}
