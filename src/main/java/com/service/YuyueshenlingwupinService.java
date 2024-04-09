package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyueshenlingwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyueshenlingwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueshenlingwupinView;


/**
 * 预约申领物品
 *
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface YuyueshenlingwupinService extends IService<YuyueshenlingwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueshenlingwupinVO> selectListVO(Wrapper<YuyueshenlingwupinEntity> wrapper);
   	
   	YuyueshenlingwupinVO selectVO(@Param("ew") Wrapper<YuyueshenlingwupinEntity> wrapper);
   	
   	List<YuyueshenlingwupinView> selectListView(Wrapper<YuyueshenlingwupinEntity> wrapper);
   	
   	YuyueshenlingwupinView selectView(@Param("ew") Wrapper<YuyueshenlingwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueshenlingwupinEntity> wrapper);
   	

}

