package com.lxm.mybatisplus.system.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lxm.mybatisplus.system.entity.TDept;
import com.lxm.mybatisplus.system.service.ITDeptService;

/**
 * @author lxm
 */
@RestController
@RequestMapping("/system/dept")
public class TDeptController {
	@Autowired
	private ITDeptService deptService;
	
	@RequestMapping("getList")
	public List getList() {
		QueryWrapper<TDept> wrapper = new QueryWrapper<TDept>();
		return deptService.list(wrapper);
	}

}
