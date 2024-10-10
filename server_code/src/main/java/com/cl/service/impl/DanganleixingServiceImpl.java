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


import com.cl.dao.DanganleixingDao;
import com.cl.entity.DanganleixingEntity;
import com.cl.service.DanganleixingService;
import com.cl.entity.view.DanganleixingView;

@Service("danganleixingService")
public class DanganleixingServiceImpl extends ServiceImpl<DanganleixingDao, DanganleixingEntity> implements DanganleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanganleixingEntity> page = this.selectPage(
                new Query<DanganleixingEntity>(params).getPage(),
                new EntityWrapper<DanganleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanganleixingEntity> wrapper) {
		  Page<DanganleixingView> page =new Query<DanganleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DanganleixingView> selectListView(Wrapper<DanganleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanganleixingView selectView(Wrapper<DanganleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
