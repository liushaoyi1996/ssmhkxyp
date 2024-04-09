package com.dao;

import com.entity.JuanzengwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuanzengwupinVO;
import com.entity.view.JuanzengwupinView;


/**
 * 捐赠物品
 * 
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface JuanzengwupinDao extends BaseMapper<JuanzengwupinEntity> {
	
	List<JuanzengwupinVO> selectListVO(@Param("ew") Wrapper<JuanzengwupinEntity> wrapper);
	
	JuanzengwupinVO selectVO(@Param("ew") Wrapper<JuanzengwupinEntity> wrapper);
	
	List<JuanzengwupinView> selectListView(@Param("ew") Wrapper<JuanzengwupinEntity> wrapper);

	List<JuanzengwupinView> selectListView(Pagination page,@Param("ew") Wrapper<JuanzengwupinEntity> wrapper);
	
	JuanzengwupinView selectView(@Param("ew") Wrapper<JuanzengwupinEntity> wrapper);
	

}
