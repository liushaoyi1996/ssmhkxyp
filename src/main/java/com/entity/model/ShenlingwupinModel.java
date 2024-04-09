package com.entity.model;

import com.entity.ShenlingwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 申领物品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public class ShenlingwupinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
