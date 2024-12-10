package com.example.forum.mapper;

import com.example.forum.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    int insertPost(Post post);

    Post findById(@Param("id") Long id);

    List<Post> findAll(@Param("offset") int offset,
                       @Param("limit") int limit,
                       @Param("categoryId") Integer categoryId);

    int updatePost(Post post);

    int deletePost(@Param("id") Long id);
}
