package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 档案信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-23 12:46:21
 */
@TableName("danganxinxi")
public class DanganxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DanganxinxiEntity() {
		
	}
	
	public DanganxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 档案编号
	 */
					
	private String danganbianhao;
	
	/**
	 * 档案名称
	 */
					
	private String danganmingcheng;
	
	/**
	 * 档案类型
	 */
					
	private String danganleixing;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 文件资料
	 */
					
	private String wenjianziliao;
	
	/**
	 * 档案简介
	 */
					
	private String danganjianjie;
	
	/**
	 * 录档时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ludangshijian;
	
	/**
	 * 所属人
	 */
					
	private String suoshuren;
	
	/**
	 * 档案授权人
	 */
					
	private String danganshouquanren;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	/**
	 * 管理员账号
	 */
					
	private String guanliyuanzhanghao;
	
	/**
	 * 管理员姓名
	 */
					
	private String guanliyuanxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：档案编号
	 */
	public void setDanganbianhao(String danganbianhao) {
		this.danganbianhao = danganbianhao;
	}
	/**
	 * 获取：档案编号
	 */
	public String getDanganbianhao() {
		return danganbianhao;
	}
	/**
	 * 设置：档案名称
	 */
	public void setDanganmingcheng(String danganmingcheng) {
		this.danganmingcheng = danganmingcheng;
	}
	/**
	 * 获取：档案名称
	 */
	public String getDanganmingcheng() {
		return danganmingcheng;
	}
	/**
	 * 设置：档案类型
	 */
	public void setDanganleixing(String danganleixing) {
		this.danganleixing = danganleixing;
	}
	/**
	 * 获取：档案类型
	 */
	public String getDanganleixing() {
		return danganleixing;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：文件资料
	 */
	public void setWenjianziliao(String wenjianziliao) {
		this.wenjianziliao = wenjianziliao;
	}
	/**
	 * 获取：文件资料
	 */
	public String getWenjianziliao() {
		return wenjianziliao;
	}
	/**
	 * 设置：档案简介
	 */
	public void setDanganjianjie(String danganjianjie) {
		this.danganjianjie = danganjianjie;
	}
	/**
	 * 获取：档案简介
	 */
	public String getDanganjianjie() {
		return danganjianjie;
	}
	/**
	 * 设置：录档时间
	 */
	public void setLudangshijian(Date ludangshijian) {
		this.ludangshijian = ludangshijian;
	}
	/**
	 * 获取：录档时间
	 */
	public Date getLudangshijian() {
		return ludangshijian;
	}
	/**
	 * 设置：所属人
	 */
	public void setSuoshuren(String suoshuren) {
		this.suoshuren = suoshuren;
	}
	/**
	 * 获取：所属人
	 */
	public String getSuoshuren() {
		return suoshuren;
	}
	/**
	 * 设置：档案授权人
	 */
	public void setDanganshouquanren(String danganshouquanren) {
		this.danganshouquanren = danganshouquanren;
	}
	/**
	 * 获取：档案授权人
	 */
	public String getDanganshouquanren() {
		return danganshouquanren;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
	/**
	 * 设置：管理员账号
	 */
	public void setGuanliyuanzhanghao(String guanliyuanzhanghao) {
		this.guanliyuanzhanghao = guanliyuanzhanghao;
	}
	/**
	 * 获取：管理员账号
	 */
	public String getGuanliyuanzhanghao() {
		return guanliyuanzhanghao;
	}
	/**
	 * 设置：管理员姓名
	 */
	public void setGuanliyuanxingming(String guanliyuanxingming) {
		this.guanliyuanxingming = guanliyuanxingming;
	}
	/**
	 * 获取：管理员姓名
	 */
	public String getGuanliyuanxingming() {
		return guanliyuanxingming;
	}

}
