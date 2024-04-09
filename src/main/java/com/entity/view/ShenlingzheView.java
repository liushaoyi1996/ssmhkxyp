package com.entity.view;

import com.entity.ShenlingzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申领者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
@TableName("shenlingzhe")
public class ShenlingzheView  extends ShenlingzheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenlingzheView(){
	}
 
 	public ShenlingzheView(ShenlingzheEntity shenlingzheEntity){
 	try {
			BeanUtils.copyProperties(this, shenlingzheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
