package com.entity.view;

import com.entity.YuyueshenlingwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约申领物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
@TableName("yuyueshenlingwupin")
public class YuyueshenlingwupinView  extends YuyueshenlingwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyueshenlingwupinView(){
	}
 
 	public YuyueshenlingwupinView(YuyueshenlingwupinEntity yuyueshenlingwupinEntity){
 	try {
			BeanUtils.copyProperties(this, yuyueshenlingwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
