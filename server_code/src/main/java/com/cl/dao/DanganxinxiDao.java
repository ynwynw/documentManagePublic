package com.cl.dao;

import com.cl.entity.DanganxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DanganxinxiView;


/**
 * 档案信息
 * 
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
public interface DanganxinxiDao extends BaseMapper<DanganxinxiEntity> {
	
	List<DanganxinxiView> selectListView(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);

	List<DanganxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
	
	DanganxinxiView selectView(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
	

}
