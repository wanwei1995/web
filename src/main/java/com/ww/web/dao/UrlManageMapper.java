package com.ww.web.dao;

import com.ww.web.model.UrlManage;

public interface UrlManageMapper {
   
    int deleteByPrimaryKey(Integer id);

    int insert(UrlManage record);

    int insertSelective(UrlManage record);

    UrlManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UrlManage record);

    int updateByPrimaryKey(UrlManage record);
}