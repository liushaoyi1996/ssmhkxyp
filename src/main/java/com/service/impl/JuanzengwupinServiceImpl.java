package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JuanzengwupinDao;
import com.entity.JuanzengwupinEntity;
import com.service.JuanzengwupinService;
import com.entity.vo.JuanzengwupinVO;
import com.entity.view.JuanzengwupinView;

@Service("juanzengwupinService")
public class JuanzengwupinServiceImpl extends ServiceImpl<JuanzengwupinDao, JuanzengwupinEntity> implements JuanzengwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuanzengwupinEntity> page = this.selectPage(
                new Query<JuanzengwupinEntity>(params).getPage(),
                new EntityWrapper<JuanzengwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuanzengwupinEntity> wrapper) {
		  Page<JuanzengwupinView> page =new Query<JuanzengwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuanzengwupinVO> selectListVO(Wrapper<JuanzengwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuanzengwupinVO selectVO(Wrapper<JuanzengwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuanzengwupinView> selectListView(Wrapper<JuanzengwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuanzengwupinView selectView(Wrapper<JuanzengwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
