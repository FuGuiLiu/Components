package com.sky.boot.service.impl;

import com.github.pagehelper.PageHelper;
import com.sky.boot.dao.TzAreaDao;
import com.sky.boot.entity.TzArea;
import com.sky.boot.service.TzAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Administrator
 */
@Service(value = "TzAreaServiceImpl")
public class TzAreaServiceImpl implements TzAreaService {
    @Autowired
    TzAreaDao tzAreaDao;

    @Override
    public TzArea findTzAreaId(Long userId) {
        return tzAreaDao.selectByPrimaryKey(userId);
    }

    @Override
    public List<TzArea> findAll() {
        return tzAreaDao.selectAll();
    }

    @Override
    public List<TzArea> findPage(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNumber();
        int pageSize = pageRequest.getPageSize();
        // 对数据进行倒序排序 area_id 后面要加一个空格, area_id对应数据库的字段即可
        String sort = "area_id" + "desc";
        PageHelper.startPage(pageNum, pageSize);
        return tzAreaDao.paginationSelect();
    }
}
