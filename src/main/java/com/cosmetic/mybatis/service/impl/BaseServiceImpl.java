package com.cosmetic.mybatis.service.impl;

import com.cosmetic.mybatis.dao.IBaseDao;
import com.cosmetic.mybatis.domain.BaseDomain;
import com.cosmetic.mybatis.service.IBaseService;

/**
 * 父service实现
 *
 * @author lijun
 * @since 2017/3/24 11:18
 */
public class BaseServiceImpl<T extends BaseDomain> implements IBaseService<T> {

    private IBaseDao baseDao;

    public IBaseDao getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(IBaseDao baseDao) {
        this.baseDao = baseDao;
    }

    public int deleteByPrimaryKey(Long id) {
        return baseDao.deleteByPrimaryKey(id);
    }

    public int insert(T record) {
        return baseDao.insert(record);
    }

    public int insertSelective(T record) {
        return baseDao.insertSelective(record);
    }

    public T selectByPrimaryKey(Long id) {
        return (T) baseDao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T record) {
        return baseDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record) {
        return baseDao.updateByPrimaryKey(record);
    }
}
