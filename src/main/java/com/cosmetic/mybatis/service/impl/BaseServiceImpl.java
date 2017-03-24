package com.cosmetic.mybatis.service.impl;

import com.cosmetic.mybatis.dao.IBaseDao;
import com.cosmetic.mybatis.domain.BaseDomain;
import com.cosmetic.mybatis.service.IBaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 父service实现
 *
 * @author lijun
 * @since 2017/3/24 11:18
 */
public class BaseServiceImpl<T extends BaseDomain> implements IBaseService<T> {

    public static final int DEFAULT_PAGE_NO = 1;

    public static final int DEFAULT_PAGE_SIZE = 10;

    private IBaseDao baseDao;

    public IBaseDao getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(IBaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Transactional
    public int deleteByPrimaryKey(Long id) {
        return baseDao.deleteByPrimaryKey(id);
    }

    @Transactional
    public int insert(T record) {
        return baseDao.insert(record);
    }

    @Transactional
    public int insertSelective(T record) {
        return baseDao.insertSelective(record);
    }

    public T selectByPrimaryKey(Long id) {
        return (T) baseDao.selectByPrimaryKey(id);
    }

    @Transactional
    public int updateByPrimaryKeySelective(T record) {
        return baseDao.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int updateByPrimaryKey(T record) {
        return baseDao.updateByPrimaryKey(record);
    }

    public List<T> selectListByName(String name) {
        return baseDao.selectListByName(name);
    }

    public PageInfo<T> selectPageByName(String name, Integer pageNo, Integer pageSize) {
        pageNo = pageNo == null ? DEFAULT_PAGE_NO : pageNo;
        pageSize = pageSize == null ? DEFAULT_PAGE_SIZE : pageSize;
        PageHelper.startPage(pageNo,pageSize);
        List<T> list = baseDao.selectListByName(name);
        PageInfo<T> page = new PageInfo<T>(list);
        return page;
    }
}
