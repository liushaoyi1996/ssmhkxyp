package com.dao;

import com.entity.ShenlingwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenlingwupinVO;
import com.entity.view.ShenlingwupinView;


/**
 * 申领物品
 * 
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface ShenlingwupinDao extends BaseMapper<ShenlingwupinEntity> {
	
	List<ShenlingwupinVO> selectListVO(@Param("ew") Wrapper<ShenlingwupinEntity> wrapper);
	
	ShenlingwupinVO selectVO(@Param("ew") Wrapper<ShenlingwupinEntity> wrapper);
	
	List<ShenlingwupinView> selectListView(@Param("ew") Wrapper<ShenlingwupinEntity> wrapper);

	List<ShenlingwupinView> selectListView(Pagination page,@Param("ew") Wrapper<ShenlingwupinEntity> wrapper);
	
	ShenlingwupinView selectView(@Param("ew") Wrapper<ShenlingwupinEntity> wrapper);
	

}
