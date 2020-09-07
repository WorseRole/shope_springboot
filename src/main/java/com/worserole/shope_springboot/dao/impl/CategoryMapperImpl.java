package com.worserole.shope_springboot.dao.impl;

import com.worserole.shope_springboot.dao.CategoryMapper;
import com.worserole.shope_springboot.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyanyan on 2020/8/28 1:01 上午
 */
@Repository
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public List<Category> getCategoryList() {
        return null;
    }
}
