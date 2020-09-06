package com.worserole.shope_springboot.dao;

import com.worserole.shope_springboot.pojo.Category;

import java.util.List;

/**
 * Created by liyanyan on 2020/8/28 12:59 上午
 */
public interface CategoryMapper {

    List<Category> getCategoryList();

}
