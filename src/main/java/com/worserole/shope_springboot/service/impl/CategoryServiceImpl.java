package com.worserole.shope_springboot.service.impl;

import com.worserole.shope_springboot.mapper.CategoryMapper;
import com.worserole.shope_springboot.pojo.Category;
import com.worserole.shope_springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liyanyan on 2020/9/6 11:17 下午
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryList() {
        List<Category> categoryList = categoryMapper.getCategoryList();
        return categoryList;
    }
}