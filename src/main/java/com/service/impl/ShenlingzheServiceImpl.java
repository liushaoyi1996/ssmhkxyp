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


import com.dao.ShenlingzheDao;
import com.entity.ShenlingzheEntity;
import com.service.ShenlingzheService;
import com.entity.vo.ShenlingzheVO;
import com.entity.view.ShenlingzheView;

@Service("shenlingzheService")
public class ShenlingzheServiceImpl extends ServiceImpl<ShenlingzheDao, ShenlingzheEntity> implements ShenlingzheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenlingzheEntity> page = this.selectPage(
                new Query<ShenlingzheEntity>(params).getPage(),
                new EntityWrapper<ShenlingzheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenlingzheEntity> wrapper) {
		  Page<ShenlingzheView> page =new Query<ShenlingzheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenlingzheVO> selectListVO(Wrapper<ShenlingzheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenlingzheVO selectVO(Wrapper<ShenlingzheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenlingzheView> selectListView(Wrapper<ShenlingzheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenlingzheView selectView(Wrapper<ShenlingzheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
