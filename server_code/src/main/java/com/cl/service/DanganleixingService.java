package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DanganleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DanganleixingView;


/**
 * 档案类型
 *
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
public interface DanganleixingService extends IService<DanganleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanganleixingView> selectListView(Wrapper<DanganleixingEntity> wrapper);
   	
   	DanganleixingView selectView(@Param("ew") Wrapper<DanganleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanganleixingEntity> wrapper);
   	

}

