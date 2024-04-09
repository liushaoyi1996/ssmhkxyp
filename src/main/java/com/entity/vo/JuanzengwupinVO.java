package com.entity.vo;

import com.entity.JuanzengwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 捐赠物品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public class JuanzengwupinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品图片
	 */
	
	private String wupintupian;
		
	/**
	 * 物品分类
	 */
	
	private String wupinfenlei;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 捐赠地点
	 */
	
	private String juanzengdidian;
		
	/**
	 * 捐赠日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date juanzengriqi;
		
	/**
	 * 捐赠账号
	 */
	
	private String juanzengzhanghao;
		
	/**
	 * 捐赠姓名
	 */
	
	private String juanzengxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：物品图片
	 */
	 
	public void setWupintupian(String wupintupian) {
		this.wupintupian = wupintupian;
	}
	
	/**
	 * 获取：物品图片
	 */
	public String getWupintupian() {
		return wupintupian;
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
	 * 设置：捐赠地点
	 */
	 
	public void setJuanzengdidian(String juanzengdidian) {
		this.juanzengdidian = juanzengdidian;
	}
	
	/**
	 * 获取：捐赠地点
	 */
	public String getJuanzengdidian() {
		return juanzengdidian;
	}
				
	
	/**
	 * 设置：捐赠日期
	 */
	 
	public void setJuanzengriqi(Date juanzengriqi) {
		this.juanzengriqi = juanzengriqi;
	}
	
	/**
	 * 获取：捐赠日期
	 */
	public Date getJuanzengriqi() {
		return juanzengriqi;
	}
				
	
	/**
	 * 设置：捐赠账号
	 */
	 
	public void setJuanzengzhanghao(String juanzengzhanghao) {
		this.juanzengzhanghao = juanzengzhanghao;
	}
	
	/**
	 * 获取：捐赠账号
	 */
	public String getJuanzengzhanghao() {
		return juanzengzhanghao;
	}
				
	
	/**
	 * 设置：捐赠姓名
	 */
	 
	public void setJuanzengxingming(String juanzengxingming) {
		this.juanzengxingming = juanzengxingming;
	}
	
	/**
	 * 获取：捐赠姓名
	 */
	public String getJuanzengxingming() {
		return juanzengxingming;
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
