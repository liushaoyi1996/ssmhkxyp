package com.dao;

import com.entity.YuyueshenlingwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyueshenlingwupinVO;
import com.entity.view.YuyueshenlingwupinView;


/**
 * 预约申领物品
 * 
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface YuyueshenlingwupinDao extends BaseMapper<YuyueshenlingwupinEntity> {
	
	List<YuyueshenlingwupinVO> selectListVO(@Param("ew") Wrapper<YuyueshenlingwupinEntity> wrapper);
	
	YuyueshenlingwupinVO selectVO(@Param("ew") Wrapper<YuyueshenlingwupinEntity> wrapper);
	
	List<YuyueshenlingwupinView> selectListView(@Param("ew") Wrapper<YuyueshenlingwupinEntity> wrapper);

	List<YuyueshenlingwupinView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueshenlingwupinEntity> wrapper);
	
	YuyueshenlingwupinView selectView(@Param("ew") Wrapper<YuyueshenlingwupinEntity> wrapper);
	

}
