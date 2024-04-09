package com.entity.view;

import com.entity.JuanzengchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 捐赠处理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
@TableName("juanzengchuli")
public class JuanzengchuliView  extends JuanzengchuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JuanzengchuliView(){
	}
 
 	public JuanzengchuliView(JuanzengchuliEntity juanzengchuliEntity){
 	try {
			BeanUtils.copyProperties(this, juanzengchuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
