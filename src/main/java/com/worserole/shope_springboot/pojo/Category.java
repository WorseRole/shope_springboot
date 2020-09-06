package com.worserole.shope_springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liyanyan on 2020/8/28 12:46 上午
 * 分类列表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private Integer id;

    private String name;

}
