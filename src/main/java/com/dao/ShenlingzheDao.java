package com.dao;

import com.entity.ShenlingzheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenlingzheVO;
import com.entity.view.ShenlingzheView;


/**
 * 申领者
 * 
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface ShenlingzheDao extends BaseMapper<ShenlingzheEntity> {
	
	List<ShenlingzheVO> selectListVO(@Param("ew") Wrapper<ShenlingzheEntity> wrapper);
	
	ShenlingzheVO selectVO(@Param("ew") Wrapper<ShenlingzheEntity> wrapper);
	
	List<ShenlingzheView> selectListView(@Param("ew") Wrapper<ShenlingzheEntity> wrapper);

	List<ShenlingzheView> selectListView(Pagination page,@Param("ew") Wrapper<ShenlingzheEntity> wrapper);
	
	ShenlingzheView selectView(@Param("ew") Wrapper<ShenlingzheEntity> wrapper);
	

}
