package com.dao;

import com.entity.JuanzengchuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuanzengchuliVO;
import com.entity.view.JuanzengchuliView;


/**
 * 捐赠处理
 * 
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface JuanzengchuliDao extends BaseMapper<JuanzengchuliEntity> {
	
	List<JuanzengchuliVO> selectListVO(@Param("ew") Wrapper<JuanzengchuliEntity> wrapper);
	
	JuanzengchuliVO selectVO(@Param("ew") Wrapper<JuanzengchuliEntity> wrapper);
	
	List<JuanzengchuliView> selectListView(@Param("ew") Wrapper<JuanzengchuliEntity> wrapper);

	List<JuanzengchuliView> selectListView(Pagination page,@Param("ew") Wrapper<JuanzengchuliEntity> wrapper);
	
	JuanzengchuliView selectView(@Param("ew") Wrapper<JuanzengchuliEntity> wrapper);
	

}
