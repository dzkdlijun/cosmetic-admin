package com.cosmetic.mybatis.service;

import com.cosmetic.mybatis.domain.BaseDomain;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * service 父接口
 *
 * @author lijun
 * @since 2017/3/24 11:16
 */
public interface IBaseService<T extends BaseDomain> {

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> selectListByName(String name);

    PageInfo<T> selectPageByName(String name, Integer pageNo,Integer pageSize);
}
