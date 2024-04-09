package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenlingzheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenlingzheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenlingzheView;


/**
 * 申领者
 *
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface ShenlingzheService extends IService<ShenlingzheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenlingzheVO> selectListVO(Wrapper<ShenlingzheEntity> wrapper);
   	
   	ShenlingzheVO selectVO(@Param("ew") Wrapper<ShenlingzheEntity> wrapper);
   	
   	List<ShenlingzheView> selectListView(Wrapper<ShenlingzheEntity> wrapper);
   	
   	ShenlingzheView selectView(@Param("ew") Wrapper<ShenlingzheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenlingzheEntity> wrapper);
   	

}

