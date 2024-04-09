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


import com.dao.JuanzengchuliDao;
import com.entity.JuanzengchuliEntity;
import com.service.JuanzengchuliService;
import com.entity.vo.JuanzengchuliVO;
import com.entity.view.JuanzengchuliView;

@Service("juanzengchuliService")
public class JuanzengchuliServiceImpl extends ServiceImpl<JuanzengchuliDao, JuanzengchuliEntity> implements JuanzengchuliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuanzengchuliEntity> page = this.selectPage(
                new Query<JuanzengchuliEntity>(params).getPage(),
                new EntityWrapper<JuanzengchuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuanzengchuliEntity> wrapper) {
		  Page<JuanzengchuliView> page =new Query<JuanzengchuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuanzengchuliVO> selectListVO(Wrapper<JuanzengchuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuanzengchuliVO selectVO(Wrapper<JuanzengchuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuanzengchuliView> selectListView(Wrapper<JuanzengchuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuanzengchuliView selectView(Wrapper<JuanzengchuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
