package com.worserole.shope_springboot.controller;

import com.worserole.shope_springboot.dto.ResponseData;
import com.worserole.shope_springboot.pojo.Category;
import com.worserole.shope_springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by liyanyan on 2020/9/6 11:43 下午
 */
@RestController
public class CategoryController {

    @Resource
    CategoryService categoryService;

    @GetMapping("/categoriesList")
    public ResponseData getCategoryList() {
        return new ResponseData<>(categoryService.getCategoryList());
    }

}
