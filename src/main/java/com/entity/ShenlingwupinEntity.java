package com.entity;

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
 * 申领物品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
@TableName("shenlingwupin")
public class ShenlingwupinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShenlingwupinEntity() {
		
	}
	
	public ShenlingwupinEntity(T t) {
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
	 * 申领编号
	 */
					
	private String shenlingbianhao;
	
	/**
	 * 物品名称
	 */
					
	private String wupinmingcheng;
	
	/**
	 * 物品分类
	 */
					
	private String wupinfenlei;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 申领原因
	 */
					
	private String shenlingyuanyin;
	
	/**
	 * 申领时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenlingshijian;
	
	/**
	 * 申领账号
	 */
					
	private String shenlingzhanghao;
	
	/**
	 * 申领姓名
	 */
					
	private String shenlingxingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：申领编号
	 */
	public void setShenlingbianhao(String shenlingbianhao) {
		this.shenlingbianhao = shenlingbianhao;
	}
	/**
	 * 获取：申领编号
	 */
	public String getShenlingbianhao() {
		return shenlingbianhao;
	}
	/**
	 * 设置：物品名称
	 */
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
	/**
	 * 设置：物品分类
	 */
	public void setWupinfenlei(String wupinfenlei) {
		this.wupinfenlei = wupinfenlei;
	}
	/**
	 * 获取：物品分类
	 */
	public String getWupinfenlei() {
		return wupinfenlei;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：申领原因
	 */
	public void setShenlingyuanyin(String shenlingyuanyin) {
		this.shenlingyuanyin = shenlingyuanyin;
	}
	/**
	 * 获取：申领原因
	 */
	public String getShenlingyuanyin() {
		return shenlingyuanyin;
	}
	/**
	 * 设置：申领时间
	 */
	public void setShenlingshijian(Date shenlingshijian) {
		this.shenlingshijian = shenlingshijian;
	}
	/**
	 * 获取：申领时间
	 */
	public Date getShenlingshijian() {
		return shenlingshijian;
	}
	/**
	 * 设置：申领账号
	 */
	public void setShenlingzhanghao(String shenlingzhanghao) {
		this.shenlingzhanghao = shenlingzhanghao;
	}
	/**
	 * 获取：申领账号
	 */
	public String getShenlingzhanghao() {
		return shenlingzhanghao;
	}
	/**
	 * 设置：申领姓名
	 */
	public void setShenlingxingming(String shenlingxingming) {
		this.shenlingxingming = shenlingxingming;
	}
	/**
	 * 获取：申领姓名
	 */
	public String getShenlingxingming() {
		return shenlingxingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
