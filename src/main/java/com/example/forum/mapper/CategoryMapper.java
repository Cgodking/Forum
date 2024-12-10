package com.example.forum.mapper;


import com.example.forum.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    int insertCategory(Category category);

    Category findById(@Param("id") Integer id);

    List<Category> findAll();

    int updateCategory(Category category);

    int deleteCategory(@Param("id") Integer id);
}
