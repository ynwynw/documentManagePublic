package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DanganxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DanganxinxiView;


/**
 * 档案信息
 *
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
public interface DanganxinxiService extends IService<DanganxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanganxinxiView> selectListView(Wrapper<DanganxinxiEntity> wrapper);
   	
   	DanganxinxiView selectView(@Param("ew") Wrapper<DanganxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanganxinxiEntity> wrapper);
   	

}

