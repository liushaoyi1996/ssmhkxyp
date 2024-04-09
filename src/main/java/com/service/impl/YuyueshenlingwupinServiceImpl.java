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


import com.dao.YuyueshenlingwupinDao;
import com.entity.YuyueshenlingwupinEntity;
import com.service.YuyueshenlingwupinService;
import com.entity.vo.YuyueshenlingwupinVO;
import com.entity.view.YuyueshenlingwupinView;

@Service("yuyueshenlingwupinService")
public class YuyueshenlingwupinServiceImpl extends ServiceImpl<YuyueshenlingwupinDao, YuyueshenlingwupinEntity> implements YuyueshenlingwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyueshenlingwupinEntity> page = this.selectPage(
                new Query<YuyueshenlingwupinEntity>(params).getPage(),
                new EntityWrapper<YuyueshenlingwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyueshenlingwupinEntity> wrapper) {
		  Page<YuyueshenlingwupinView> page =new Query<YuyueshenlingwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyueshenlingwupinVO> selectListVO(Wrapper<YuyueshenlingwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyueshenlingwupinVO selectVO(Wrapper<YuyueshenlingwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyueshenlingwupinView> selectListView(Wrapper<YuyueshenlingwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyueshenlingwupinView selectView(Wrapper<YuyueshenlingwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
