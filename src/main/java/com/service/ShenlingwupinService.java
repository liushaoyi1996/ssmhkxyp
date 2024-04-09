package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenlingwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenlingwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenlingwupinView;


/**
 * 申领物品
 *
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface ShenlingwupinService extends IService<ShenlingwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenlingwupinVO> selectListVO(Wrapper<ShenlingwupinEntity> wrapper);
   	
   	ShenlingwupinVO selectVO(@Param("ew") Wrapper<ShenlingwupinEntity> wrapper);
   	
   	List<ShenlingwupinView> selectListView(Wrapper<ShenlingwupinEntity> wrapper);
   	
   	ShenlingwupinView selectView(@Param("ew") Wrapper<ShenlingwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenlingwupinEntity> wrapper);
   	

}

