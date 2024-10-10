package com.cl.dao;

import com.cl.entity.DanganleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DanganleixingView;


/**
 * 档案类型
 * 
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
public interface DanganleixingDao extends BaseMapper<DanganleixingEntity> {
	
	List<DanganleixingView> selectListView(@Param("ew") Wrapper<DanganleixingEntity> wrapper);

	List<DanganleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DanganleixingEntity> wrapper);
	
	DanganleixingView selectView(@Param("ew") Wrapper<DanganleixingEntity> wrapper);
	

}
