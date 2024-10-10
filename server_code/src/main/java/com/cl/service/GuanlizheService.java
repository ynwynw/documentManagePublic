package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GuanlizheEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GuanlizheView;


/**
 * 管理者
 *
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
public interface GuanlizheService extends IService<GuanlizheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanlizheView> selectListView(Wrapper<GuanlizheEntity> wrapper);
   	
   	GuanlizheView selectView(@Param("ew") Wrapper<GuanlizheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanlizheEntity> wrapper);
   	

}

