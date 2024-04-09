package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuanzengchuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuanzengchuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuanzengchuliView;


/**
 * 捐赠处理
 *
 * @author 
 * @email 
 * @date 2022-12-14 14:41:05
 */
public interface JuanzengchuliService extends IService<JuanzengchuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuanzengchuliVO> selectListVO(Wrapper<JuanzengchuliEntity> wrapper);
   	
   	JuanzengchuliVO selectVO(@Param("ew") Wrapper<JuanzengchuliEntity> wrapper);
   	
   	List<JuanzengchuliView> selectListView(Wrapper<JuanzengchuliEntity> wrapper);
   	
   	JuanzengchuliView selectView(@Param("ew") Wrapper<JuanzengchuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuanzengchuliEntity> wrapper);
   	

}

