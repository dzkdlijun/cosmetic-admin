package com.cosmetic.mybatis.dao;

import com.cosmetic.mybatis.domain.BaseDomain;

import java.util.List;

/**
 * IBaseDao
 *
 * @author lijun
 * @since 2017/3/24 14:32
 */
public interface IBaseDao<T extends BaseDomain> {

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> selectListByName(String name);
}
