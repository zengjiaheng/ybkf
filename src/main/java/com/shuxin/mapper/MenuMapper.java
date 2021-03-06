package com.shuxin.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuxin.model.Menu;
import com.shuxin.model.Resource;
import com.shuxin.model.vo.SysUserVo;


/**
 *
 * Menu 表数据库控制层接口
 *
 */
public interface MenuMapper extends BaseMapper<Menu> {

	  List<Menu> selectTreeByCondition(Pagination page, Map<String, Object> params);

	  List<Menu> selectUserRoleMenuList(Map<String, Object> params);
	  
}