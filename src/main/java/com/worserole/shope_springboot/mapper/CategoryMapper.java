package com.worserole.shope_springboot.mapper;

import com.worserole.shope_springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liyanyan on 2020/8/28 12:59 上午
 */
@Mapper
public interface CategoryMapper {

    List<Category> getCategoryList();

}
