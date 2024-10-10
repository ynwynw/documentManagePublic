package com.cl.entity.view;

import com.cl.entity.DanganxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 档案信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
@TableName("danganxinxi")
public class DanganxinxiView  extends DanganxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DanganxinxiView(){
	}
 
 	public DanganxinxiView(DanganxinxiEntity danganxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, danganxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
