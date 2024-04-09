package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuanzengwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuanzengwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuanzengwupinView;


/**
 * 捐赠物品
 *
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface JuanzengwupinService extends IService<JuanzengwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuanzengwupinVO> selectListVO(Wrapper<JuanzengwupinEntity> wrapper);
   	
   	JuanzengwupinVO selectVO(@Param("ew") Wrapper<JuanzengwupinEntity> wrapper);
   	
   	List<JuanzengwupinView> selectListView(Wrapper<JuanzengwupinEntity> wrapper);
   	
   	JuanzengwupinView selectView(@Param("ew") Wrapper<JuanzengwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuanzengwupinEntity> wrapper);
   	

}

