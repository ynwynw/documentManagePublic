package com.cl.dao;

import com.cl.entity.GuanlizheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GuanlizheView;


/**
 * 管理者
 * 
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
public interface GuanlizheDao extends BaseMapper<GuanlizheEntity> {
	
	List<GuanlizheView> selectListView(@Param("ew") Wrapper<GuanlizheEntity> wrapper);

	List<GuanlizheView> selectListView(Pagination page,@Param("ew") Wrapper<GuanlizheEntity> wrapper);
	
	GuanlizheView selectView(@Param("ew") Wrapper<GuanlizheEntity> wrapper);
	

}
