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


import com.dao.ShenlingwupinDao;
import com.entity.ShenlingwupinEntity;
import com.service.ShenlingwupinService;
import com.entity.vo.ShenlingwupinVO;
import com.entity.view.ShenlingwupinView;

@Service("shenlingwupinService")
public class ShenlingwupinServiceImpl extends ServiceImpl<ShenlingwupinDao, ShenlingwupinEntity> implements ShenlingwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenlingwupinEntity> page = this.selectPage(
                new Query<ShenlingwupinEntity>(params).getPage(),
                new EntityWrapper<ShenlingwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenlingwupinEntity> wrapper) {
		  Page<ShenlingwupinView> page =new Query<ShenlingwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenlingwupinVO> selectListVO(Wrapper<ShenlingwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenlingwupinVO selectVO(Wrapper<ShenlingwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenlingwupinView> selectListView(Wrapper<ShenlingwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenlingwupinView selectView(Wrapper<ShenlingwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
