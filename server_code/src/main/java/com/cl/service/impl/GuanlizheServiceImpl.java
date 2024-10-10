package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.GuanlizheDao;
import com.cl.entity.GuanlizheEntity;
import com.cl.service.GuanlizheService;
import com.cl.entity.view.GuanlizheView;

@Service("guanlizheService")
public class GuanlizheServiceImpl extends ServiceImpl<GuanlizheDao, GuanlizheEntity> implements GuanlizheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanlizheEntity> page = this.selectPage(
                new Query<GuanlizheEntity>(params).getPage(),
                new EntityWrapper<GuanlizheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanlizheEntity> wrapper) {
		  Page<GuanlizheView> page =new Query<GuanlizheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<GuanlizheView> selectListView(Wrapper<GuanlizheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanlizheView selectView(Wrapper<GuanlizheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
