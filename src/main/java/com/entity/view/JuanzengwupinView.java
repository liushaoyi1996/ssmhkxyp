package com.entity.view;

import com.entity.JuanzengwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 捐赠物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
@TableName("juanzengwupin")
public class JuanzengwupinView  extends JuanzengwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JuanzengwupinView(){
	}
 
 	public JuanzengwupinView(JuanzengwupinEntity juanzengwupinEntity){
 	try {
			BeanUtils.copyProperties(this, juanzengwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
