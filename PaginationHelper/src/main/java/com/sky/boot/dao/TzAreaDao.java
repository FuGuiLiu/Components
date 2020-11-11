package com.sky.boot.dao;

import com.sky.boot.entity.TzArea;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface TzAreaDao {
    int deleteByPrimaryKey(Long areaId);

    int insert(TzArea record);

    int insertSelective(TzArea record);

    TzArea selectByPrimaryKey(Long areaId);

    int updateByPrimaryKeySelective(TzArea record);

    int updateByPrimaryKey(TzArea record);

    /**
     * 查询全部
     *
     * @return
     */
    List<TzArea> selectAll();

    /**
     * 分页查询信息
     *
     * @return
     */
    List<TzArea> paginationSelect();
}